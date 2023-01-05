import classes.Taxi;
import enums.TaxiType;
import interfaces.impl.TaxiServiceImpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaxiServiceImpl taxiService = new TaxiServiceImpl();
        List<Taxi>listss =new ArrayList<>(Arrays.asList(
                new Taxi(1L,"Fit","5555","White",LocalDate.of(2011,5,15),TaxiType.COMFORT),
                new Taxi(2L,"Mers","1111","Black",LocalDate.of(2012,4,10),TaxiType.BUSINESS),
                new Taxi(3L,"Audi","0001","Green",LocalDate.of(2015,6,11),TaxiType.STANDARD)));






    }
}