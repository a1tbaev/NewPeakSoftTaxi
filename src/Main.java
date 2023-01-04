import classes.Client;
import classes.Taxi;
import enums.TaxiType;
import interfaces.impl.ClientServiceImpl;
import interfaces.impl.TaxiServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClientServiceImpl clientServiceimpl =new ClientServiceImpl();
        List<Client>clients=new ArrayList<>(Arrays.asList(
                new Client(11L,"Kanykei Askarbekova",LocalDate.of(2003,3,18),
                        "0990128880",new BigDecimal(1000)),
                new Client(12L,"Adil Aitbaev",LocalDate.of(2004,2,15),
                        "0990128880",new BigDecimal(2000)),
                new Client(13L,"Baytik Taalaybekov",LocalDate.of(2002,4,12),
                        "0990128880",new BigDecimal(3000))));






    }
}