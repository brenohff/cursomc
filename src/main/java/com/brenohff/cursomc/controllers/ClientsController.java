package com.brenohff.cursomc.controllers;

import com.brenohff.cursomc.entities.ClientEntity;
import com.brenohff.cursomc.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/clients")
public class ClientsController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{clientId}")
    public ResponseEntity<ClientEntity> find(@PathVariable Integer clientId) {
        ClientEntity client = clientService.getClient(clientId);
        return ResponseEntity.ok().body(client);
    }

}
