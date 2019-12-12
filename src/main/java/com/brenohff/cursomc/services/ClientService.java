package com.brenohff.cursomc.services;

import com.brenohff.cursomc.entities.ClientEntity;
import com.brenohff.cursomc.exception.ObjectNotFoundException;
import com.brenohff.cursomc.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity getClient(Integer clientId) {
        Optional<ClientEntity> client = clientRepository.findById(clientId);
        return client.orElseThrow(() -> new ObjectNotFoundException(String.format("Object %s not found with id %d", ClientService.class.getTypeName(), clientId)));
    }

}
