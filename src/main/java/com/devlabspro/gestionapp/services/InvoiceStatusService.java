package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.InvoiceStatus;
import com.devlabspro.gestionapp.repositories.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    //Return list of invoiceStatus
    public List<InvoiceStatus> getInvoiceStatuses(){

        return invoiceStatusRepository.findAll();
    }

    //Save new invoiceStatus
    public void save(InvoiceStatus invoiceStatus){

        invoiceStatusRepository.save(invoiceStatus);
    }

    //get by id
    public Optional<InvoiceStatus> findById(int id){

        return  invoiceStatusRepository.findById(id);
    }

    public void delete(Integer id) {

        invoiceStatusRepository.deleteById(id);
    }
}
