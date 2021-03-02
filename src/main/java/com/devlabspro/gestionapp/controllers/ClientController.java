package com.devlabspro.gestionapp.controllers;

import com.devlabspro.gestionapp.models.Country;
import com.devlabspro.gestionapp.models.Client;
import com.devlabspro.gestionapp.models.State;
import com.devlabspro.gestionapp.services.CountryService;
import com.devlabspro.gestionapp.services.ClientService;
import com.devlabspro.gestionapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/clients")
    public String getClients(Model model){

        model.addAttribute("clients", clientService.getClients());

        model.addAttribute("countries", countryService.getCountries());

        model.addAttribute("states", stateService.getStates());

        return "client";
    }

    @PostMapping("/clients/addNew")
    public String addNew(Client client){
        clientService.save(client);
        return  "redirect:/clients";
    }

    @RequestMapping("clients/findById")
    @ResponseBody
    public Optional<Client> findById(int id){

        return clientService.findById(id);
    }

    @RequestMapping(value="/clients/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client){
        clientService.save(client);
        return  "redirect:/clients";
    }

    @RequestMapping(value="/clients/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        clientService.delete(id);
        return  "redirect:/clients";
    }
}
