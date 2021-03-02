package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.VehicleHire;
import com.devlabspro.gestionapp.repositories.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleHireService {
    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    //Return list of vehicleHires
    public List<VehicleHire> getVehicleHires(){

        return vehicleHireRepository.findAll();
    }

    //Save new vehicleHire
    public void save(VehicleHire vehicleHire){

        vehicleHireRepository.save(vehicleHire);
    }

    //get by id
    public Optional<VehicleHire> findById(int id){

        return  vehicleHireRepository.findById(id);
    }

    public void delete(Integer id) {

        vehicleHireRepository.deleteById(id);
    }
}
