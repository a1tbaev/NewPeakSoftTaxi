import classes.Client;
import classes.Driver;
import classes.License;
import classes.Taxi;
import enums.Gender;
import enums.TaxiType;
import interfaces.impl.ClientServiceImpl;
import interfaces.impl.DriverServiceImpl;
import interfaces.impl.TaxiServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ClientServiceImpl cl = new ClientServiceImpl();
        TaxiServiceImpl tax = new TaxiServiceImpl();
        DriverServiceImpl dri = new DriverServiceImpl();
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        List<Taxi>listss =new ArrayList<>(Arrays.asList(
                new Taxi(1L,"Fit","5555","White",LocalDate.of(2011,5,15),TaxiType.COMFORT),
                new Taxi(2L,"Mers","1111","Black",LocalDate.of(2012,4,10),TaxiType.BUSINESS)));
        Taxi taxi = new Taxi(3L,"Audi","0001","Green",LocalDate.of(2015,6,11),TaxiType.STANDARD);
        List<Client>clients=new ArrayList<>(Arrays.asList(
                new Client(1L,"Kanykei Askarbekova",LocalDate.of(2003,3,18),
                        "0990128880",new BigDecimal(1000)),
                new Client(2L,"Adil Aitbaev",LocalDate.of(2004,2,15),
                        "0990128880",new BigDecimal(2000)))
                );
        Client client = new Client(3L,"Baytik Taalaybekov",LocalDate.of(2002,4,12),
                "0990128880",new BigDecimal(3000));
        clients.add(client);
        License license = new License(21L, LocalDate.of(2004,2,3), LocalDate.of(2012,2,3));
        License license1 = new License(22L, LocalDate.of(2004,2,3), LocalDate.of(2012,2,3));
        License license2 = new License(23L, LocalDate.of(2004,2,3), LocalDate.of(2012,2,3));
        Driver driver = new Driver(1L,"Kanykei", "Askarbekova", Gender.FEMALE, "12345", license, new BigDecimal(1200), null);
        Driver driver1 = new Driver(2L,"Baytik", "Taalaybekov", Gender.MALE, "12345", license1, new BigDecimal(12000), null);
        Driver driver2 = new Driver(3L,"Kanykei", "Askarbekove", Gender.FEMALE, "12345", license2, new BigDecimal(120000), null);

        List<Driver> drivers = new LinkedList<>();
        drivers.add(driver);
        drivers.add(driver1);
        drivers.add(driver2);

        while(true){System.out.println("""
        ~~~~~~~~Client~~~~~~~~~~
        1.ADD CLIENT
        2.ADD CLIENTS
        3.GET CLIENT BY NAME
        4.REMOVE CLIENT BY ID
        5.ORDER TAXI
        6.GET CLIENT AGE
        7.UNIVERSAL SORTING
        
        ~~~~~~~`Driver~~~~~~~~~~~~~
        8.ADD DRIVER 
        9.ADD DRIVERSS
        10.FIND BY ID
        11.FIND BY NAME
        12.ASSIGN TAXI TO DRIVER
        13.CHANGE TAXI OR DRIVER
        14.GET DRIVER BY TAXI MODEL
        15.UPDATE
        
        ~~~~~~~Taxi~~~~~~~
        16.ADD TAXI 
        17.ADD TAXIS
        18.FIND BY INITIAL LETTER
        19.GROUPING
        20.FILTER BY TAXI TYPE
        21.UPDATE
        
        
        WRITE COMMAND:
        """);
            switch (scanner.nextInt()){
                case 1:
                    System.out.println(cl.addClient(client));
                    break;
                case 2:
                    System.out.println(cl.addClient(clients));
                    break;
                case 3:
                    System.out.println(cl.getClientByName("Baytik"));
                    break;
                case 4:
                    System.out.println(cl.removeClientById(2L));
                    break;
                case 5:
                    System.out.println(cl.orderTaxi(2L, "COMFORT"));
                    break;
                case 6:
                    System.out.println(cl.getClientAge());
                    break;
                case 7: cl.universalSorting("word");
                     break;
                case 8:
                    System.out.println(dri.add(driver));
                    break;
                case 9:
                    System.out.println(dri.add(drivers));
                    break;
                case 10:
                    System.out.println(dri.findById(1L));
                    break;
                case 11:
                    System.out.println(dri.findByName("Baytik"));
                    break;
                case 12:
                    System.out.println(dri.assignTaxiToDriver(1L, 1L));
                    break;
                case 13:
                    System.out.println(dri.changeTaxiOrDriver(1L, 2L));
                    break;
                case 14:
                    System.out.println(dri.getDriverByTaxiModel("Mers"));
                    break;
                case 15: dri.update("Baytik");
                    break;
                case 16:
                    System.out.println(tax.add(taxi));
                    break;
                case 17:
                    System.out.println(tax.add(listss));
                    break;
                case 18:
                    System.out.println(tax.findByInitialLetter("B"));
                    break;
                case 19:
                    System.out.println(tax.grouping());
                    break;
                case 20:
                    System.out.println(tax.filterByTaxiType("Fit"));
                    break;
                case 21:  tax.update(1L);
                     break;
            }
        }
    }
}