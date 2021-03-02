package com.devlabspro.gestionapp.controllers;

import com.devlabspro.gestionapp.models.Contact;
import com.devlabspro.gestionapp.services.ContactService;
import com.devlabspro.gestionapp.services.CountryService;
import com.devlabspro.gestionapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/contacts")
    public String getContacts(Model model){

        model.addAttribute("contacts", contactService.getContacts());

        model.addAttribute("countries", countryService.getCountries());

        model.addAttribute("states", stateService.getStates());

        return "contact";
    }

    @PostMapping("/contacts/addNew")
    public String addNew(Contact contact){
        contactService.save(contact);
        return  "redirect:/contacts";
    }

    @RequestMapping("contacts/findById")
    @ResponseBody
    public Optional<Contact> findById(int id){

        return contactService.findById(id);
    }

    @RequestMapping(value="/contacts/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact){
        contactService.save(contact);
        return  "redirect:/contacts";
    }

    @RequestMapping(value="/contacts/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        contactService.delete(id);
        return  "redirect:/contacts";
    }
}
