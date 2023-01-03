package dao;

import classes.Client;
import classes.Driver;
import classes.Taxi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Database {
    Set<Client>clients = new LinkedHashSet<>();
    Set<Driver>drivers = new LinkedHashSet<>();
    Set<Taxi>taxiList = new LinkedHashSet<>();

    public Database(Set<Client> clients, Set<Driver> drivers, Set<Taxi> taxiList) {
        this.clients = clients;
        this.drivers = drivers;
        this.taxiList = taxiList;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Set<Taxi> getTaxiList() {
        return taxiList;
    }

    public void setTaxiList(Set<Taxi> taxiList) {
        this.taxiList = taxiList;
    }

    @Override
    public String toString() {
        return "Database{" +
                "clients=" + clients +
                ", drivers=" + drivers +
                ", taxiList=" + taxiList +
                '}';
    }
}