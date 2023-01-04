package interfaces.impl;

import classes.Taxi;
import dao.Database;
import enums.TaxiType;
import interfaces.TaxiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaxiServiceImpl implements TaxiService {
    Database database = new Database();
    private List<Taxi>taxis=new ArrayList<>();

    @Override
    public StringBuilder add(Taxi taxi) {
        taxis.add(taxi);
        return null;
    }

    @Override
    public StringBuilder add(List<Taxi> taxis) {
        return null;
    }

    @Override
    public List<Taxi> findByInitialLetter(String model) {
        return null;
    }

    @Override
    public Map<TaxiType, List<Taxi>> grouping() {
        return null;
    }

    @Override
    public List<Taxi> filterByTaxiType(String taxiType) {
        return null;
    }

    @Override
    public void update(Long id) {

    }
}
