package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.Client;
import com.devlabspro.gestionapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    //Return list of clients
    public List<Client> getClients(){

        return clientRepository.findAll();
    }

    //Save new client
    public void save(Client client){

        clientRepository.save(client);
    }

    //get by id
    public Optional<Client> findById(int id){

        return  clientRepository.findById(id);
    }

    public void delete(Integer id) {

        clientRepository.deleteById(id);
    }
}
