package interfaces.impl;

import classes.Client;
import classes.Taxi;
import interfaces.ClientService;

import java.util.List;
import java.util.Map;

public class ClientServiceImpl implements ClientService {
    @Override
    public String addClient(Client client) {
        return null;
    }

    @Override
    public String addClient(List<Client> clients) {
        return null;
    }

    @Override
    public List<Client> getClientByName(String name) {
        return null;
    }

    @Override
    public Client removeClientById(Long id) {
        return null;
    }

    @Override
    public Taxi orderTaxi(Long clientId, String taxiType) {
        return null;
    }

    @Override
    public Map<Integer, Client> getClientAge() {
        return null;
    }

    @Override
    public void universalSorting(String word) {

    }
}
