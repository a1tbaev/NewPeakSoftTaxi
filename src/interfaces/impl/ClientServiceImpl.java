package interfaces.impl;

import classes.Client;
import classes.Driver;
import classes.Taxi;
import dao.Database;
import interfaces.ClientService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class ClientServiceImpl implements ClientService {
    List<Client> clientList = new LinkedList<>();
    Database database = new Database();

    @Override
    public String addClient(Client client) {
        this.clientList.add(client);
        return "Successfully added";

    }

    @Override
    public String addClient(List<Client> clients) {
        this.clientList.addAll(clients);

        database.getClients().addAll(clients);
        return "Successfully added";
    }

    @Override
    public List<Client> getClientByName(String name) {
        List<Client> clientList1 = new LinkedList<>();
        for (Client client : database.getClients()) {
            String[] name1 = client.getFullName().split(" ");
            if (name1[0].equals(name)) {
                clientList1.add(client);
            }

        }
        return clientList1;
    }

    @Override
    public Client removeClientById(Long id) {
        Client client = database.getClients().stream().filter(x -> x.getId().equals(id)).findAny().get();
        database.getClients().remove(client);
        return client;
    }

    @Override
    public Taxi orderTaxi(Long clientId, String taxiType) {
        Database database1 = new Database();
        System.out.println("how many km you will move? ");
        BigDecimal distance = new Scanner(System.in).nextBigDecimal();
        Taxi taxi = null;
        for (Client client : database1.getClients()) {
            if (Objects.equals(client.getId(), clientId)){
                for (Driver driver : database1.getDrivers()) {
                     if (driver.getTaxi().getTaxiType().name().equals(taxiType.toUpperCase())){
                         taxi = driver.getTaxi();
                         BigDecimal money = distance.multiply(driver.getTaxi().getTaxiType().getPricePerKm()).add(driver.getTaxi().getTaxiType().getPriceForLanding());
                         client.setMoney(client.getMoney().subtract(money));
                         driver.setMoney(driver.getMoney().add(money));
                     }
                }
            }
        }

        return taxi;
    }

    @Override
    public Map<Integer, Client> getClientAge() {
        Map<Integer, Client> clientMap = new HashMap<>();
        for (Client clientt : database.getClients()) {
            int age = Period.between(clientt.getDateOfBirth(), LocalDate.now()).getYears();
            clientMap.put(age, clientt);
        }
        return clientMap;
    }

    @Override
    public void universalSorting(String word) {
        System.out.println("Sort by id");
        System.out.println("1-ascending," +
                "2-descending");
        Scanner scanner=new Scanner(System.in);
        int number =scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getId)).toList());
                break;
            case 2:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getId).reversed()).
                        findAny());
                break;
        }
        System.out.println("Sort by fullName");
        switch (number) {
            case 1:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getFullName)).findAny());
                break;
            case 2:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getFullName)
                        .reversed()).findAny());
                break;
        }
        System.out.println("Sort by date of birth");
        switch (number){
            case 1:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getDateOfBirth)).findAny());
                break;
            case 2:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getDateOfBirth).reversed()).findAny());
                break;
        }
        System.out.println("Sort by money");
        switch (number){
            case 1:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getMoney)).findAny());
                break;
            case 2:
                System.out.println(database.getClients().stream().
                        sorted(Comparator.comparing(Client::getMoney).reversed()));
                break;
        }



    }
}
