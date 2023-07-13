package com.amald.opinionsbackend.controller;

import com.amald.opinionsbackend.entities.Client;
import com.amald.opinionsbackend.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Client client) {
        this.clientService.create(client);
    }

    @GetMapping(produces = "application/json")
    public List<Client> clientSearch() {
       return this.clientService.search();
    }

    @GetMapping(path ="{id}", produces = "application/json")
    public Client retrieveSpecificClient(@PathVariable int id) {
        return this.clientService.retrieveSpecificClient(id);
    }
}
