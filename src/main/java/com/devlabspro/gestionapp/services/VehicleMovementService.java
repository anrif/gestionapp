package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.VehicleMovement;
import com.devlabspro.gestionapp.repositories.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMovementService {
    @Autowired
    private VehicleMovementRepository vehicleMovementRepository;

    //Return list of vehicleMovements
    public List<VehicleMovement> getVehicleMovements(){

        return vehicleMovementRepository.findAll();
    }

    //Save new vehicleMovement
    public void save(VehicleMovement vehicleMovement){

        vehicleMovementRepository.save(vehicleMovement);
    }

    //get by id
    public Optional<VehicleMovement> findById(int id){

        return  vehicleMovementRepository.findById(id);
    }

    public void delete(Integer id) {

        vehicleMovementRepository.deleteById(id);
    }
}
