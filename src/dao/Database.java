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
    public Set<Client>clients = new LinkedHashSet<>();
    public Set<Driver>drivers = new LinkedHashSet<>();
    public Set<Taxi>taxiList = new LinkedHashSet<>();
}