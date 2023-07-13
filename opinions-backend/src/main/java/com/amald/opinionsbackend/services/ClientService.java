package com.amald.opinionsbackend.services;

import com.amald.opinionsbackend.entities.Client;
import com.amald.opinionsbackend.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void create(Client client) {
        Client existedClient = this.clientRepository.findByEmail(client.getEmail());
        if (existedClient == null) {
            this.clientRepository.save(client);
        }

    }

    public List<Client> search() {
        return this.clientRepository.findAll();
    }

    public Client retrieveSpecificClient(int id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        if (optionalClient.isPresent()) {
            return optionalClient.get();
        } else {
            return null;
        }
    }
}
