package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.VehicleModel;
import com.devlabspro.gestionapp.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    //Return list of vehicleModels
    public List<VehicleModel> getVehicleModels(){

        return vehicleModelRepository.findAll();
    }

    //Save new vehicleModel
    public void save(VehicleModel vehicleModel){

        vehicleModelRepository.save(vehicleModel);
    }

    //get by id
    public Optional<VehicleModel> findById(int id){

        return  vehicleModelRepository.findById(id);
    }

    public void delete(Integer id) {

        vehicleModelRepository.deleteById(id);
    }
}
