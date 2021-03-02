package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.VehicleMake;
import com.devlabspro.gestionapp.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    //Return list of vehicleMakes
    public List<VehicleMake> getVehicleMakes(){

        return vehicleMakeRepository.findAll();
    }

    //Save new vehicleMake
    public void save(VehicleMake vehicleMake){

        vehicleMakeRepository.save(vehicleMake);
    }

    //get by id
    public Optional<VehicleMake> findById(int id){

        return  vehicleMakeRepository.findById(id);
    }

    public void delete(Integer id) {

        vehicleMakeRepository.deleteById(id);
    }
}
