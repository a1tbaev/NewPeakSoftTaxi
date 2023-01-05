package interfaces;

import classes.Driver;

import java.util.List;

public interface DriverService {
    Driver add(Driver driver);
    List<Driver> add(List<Driver>drivers);
    Driver findById(Long id);
    List<Driver> findByName(String name);
    String assignTaxiToDriver(Long taxiId,Long driverId) throws Exception;
    String changeTaxiOrDriver(Long driverId, Long taxiId);
    List<Driver> getDriverByTaxiModel(String model);
    void update(String driverName);
}
