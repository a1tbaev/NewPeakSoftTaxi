package interfaces.impl;

import classes.Driver;
import dao.Database;
import interfaces.DriverService;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DriverServiceImpl implements DriverService {
    List<Driver>driverList = new LinkedList<>();
    Driver activeDriver = null;

    @Override
    public Driver add(Driver driver) {
        this.activeDriver = driver;
        return activeDriver;
    }

    @Override
    public List<Driver> add(List<Driver> drivers) {
        driverList.addAll(drivers);
        return driverList;
    }

    @Override
    public Driver findById(Long id) {
        for(Driver driver : this.driverList){
            if(Objects.equals(driver.getId(), id)){
                return driver;
            }else{
                System.out.println("wrong id!!");
            }
        }
        return null;
    }

    @Override
    public List<Driver> findByName(String name) {
        return driverList.stream().filter(s -> s.getName().equals(name)).toList();
    }

    @Override
    public String assignTaxiToDriver(String taxiName, Long driverId) {
        Database database = new Database();
        return null;
    }

    @Override
    public String changeTaxiOrDriver(Long driverId, Long taxiId) {
        return null;
    }

    @Override
    public List<Driver> getDriverByTaxiModel(String model) {
        return null;
    }

    @Override
    public void update(String driverName) {

    }
}
