package com.amald.opinionsbackend.services;

import com.amald.opinionsbackend.entities.Client;
import com.amald.opinionsbackend.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void create(Client client) {
        this.clientRepository.save(client);
    }

    public List<Client> search() {
        return this.clientRepository.findAll();
    }
}
