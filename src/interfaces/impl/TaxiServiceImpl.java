package interfaces.impl;

import classes.Taxi;
import dao.Database;
import enums.TaxiType;
import interfaces.TaxiService;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaxiServiceImpl implements TaxiService {
    Database database = new Database();

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public StringBuilder add(Taxi taxi) {
       this.database.getTaxiList().add(taxi);
        return new StringBuilder("Successfully added!!!");
    }

    @Override
    public StringBuilder add(List<Taxi> taxis) {
        this.database.getTaxiList().addAll(taxis);
        Database database= new Database();
        taxis.forEach(database.taxiList::remove);
        database.taxiList.addAll(this.database.getTaxiList());
        return new StringBuilder("Successfully added taxis!!!");
    }

    @Override
    public List<Taxi> findByInitialLetter(String model) {
        List<Taxi>taxis =new ArrayList<>();
        for (Taxi taxi: database.getTaxiList()) {
            if (taxi.getModel().equals(String.valueOf(model))){
                taxis.add(taxi);
            }

        }
        return taxis;
    }

    @Override
    public Map<TaxiType, List<Taxi>> grouping() {
        return database.getTaxiList().stream().collect(Collectors.groupingBy(Taxi::getTaxiType));
    }

    @Override
    public List<Taxi> filterByTaxiType(String taxiType) {
        List<Taxi>taxiList = database.getTaxiList().stream().filter(taxi -> taxi.getTaxiType().name().equals(taxiType)).toList();
        return taxiList;
    }

    @Override
    public void update(Long id) {
        Scanner scanner = new Scanner(System.in);
        for (Taxi taxi : database.getTaxiList()) {
            if (Objects.equals(taxi.getId(), id)){
                System.out.println("Write taxis model: ");
                taxi.setModel(scanner.nextLine());
                System.out.println("Write taxis number: ");
                taxi.setNumber(scanner.nextLine());
                System.out.println("Write taxis color: ");
                taxi.setColour(scanner.nextLine());
                System.out.println("Write taxis year: ");
                int year = scanner.nextInt();
                System.out.println("Write taxis month: ");
                int month = scanner.nextInt();
                System.out.println("Write taxis day: ");
                int day = scanner.nextInt();
                LocalDate date = LocalDate.of(year,month,day);
                System.out.println("Write TaxiType:  ");
                String type = scanner.next();
                for (TaxiType value : TaxiType.values()) {
                    if (value.name().equals(type.toUpperCase())){
                        taxi.setTaxiType(value);
                    }
                }
            }
        }for (Taxi taxi : database.getTaxiList()) {
            if (Objects.equals(taxi.getId(), id)){
                System.out.println(taxi);
            }
        }


    }
}
