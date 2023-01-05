import classes.Client;
import classes.Driver;
import classes.License;
import classes.Taxi;
import enums.Gender;
import enums.TaxiType;
import interfaces.impl.ClientServiceImpl;
import interfaces.impl.TaxiServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxiServiceImpl taxiService = new TaxiServiceImpl();
        List<Taxi>listss =new ArrayList<>(Arrays.asList(
                new Taxi(1L,"Fit","5555","White",LocalDate.of(2011,5,15),TaxiType.COMFORT),
                new Taxi(2L,"Mers","1111","Black",LocalDate.of(2012,4,10),TaxiType.BUSINESS),
                new Taxi(3L,"Audi","0001","Green",LocalDate.of(2015,6,11),TaxiType.STANDARD)));
        ClientServiceImpl clientServiceimpl =new ClientServiceImpl();
        List<Client>clients=new ArrayList<>(Arrays.asList(
                new Client(11L,"Kanykei Askarbekova",LocalDate.of(2003,3,18),
                        "0990128880",new BigDecimal(1000)),
                new Client(12L,"Adil Aitbaev",LocalDate.of(2004,2,15),
                        "0990128880",new BigDecimal(2000)),
                new Client(13L,"Baytik Taalaybekov",LocalDate.of(2002,4,12),
                        "0990128880",new BigDecimal(3000))));
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





    }
}