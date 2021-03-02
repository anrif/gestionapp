package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.VehicleStatus;
import com.devlabspro.gestionapp.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {

    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;

    //Return list of vehicleStatus
    public List<VehicleStatus> getVehicleStatuses(){

        return vehicleStatusRepository.findAll();
    }

    //Save new vehicleStatus
    public void save(VehicleStatus vehicleStatus){

        vehicleStatusRepository.save(vehicleStatus);
    }

    //get by id
    public Optional<VehicleStatus> findById(int id){

        return  vehicleStatusRepository.findById(id);
    }

    public void delete(Integer id) {

        vehicleStatusRepository.deleteById(id);
    }
}
