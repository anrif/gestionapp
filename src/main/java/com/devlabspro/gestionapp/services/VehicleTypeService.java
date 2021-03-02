package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.VehicleType;
import com.devlabspro.gestionapp.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    //Return list of vehicleTypes
    public List<VehicleType> getVehicleTypes(){

        return vehicleTypeRepository.findAll();
    }

    //Save new vehicleType
    public void save(VehicleType vehicleType){

        vehicleTypeRepository.save(vehicleType);
    }

    //get by id
    public Optional<VehicleType> findById(int id){

        return  vehicleTypeRepository.findById(id);
    }

    public void delete(Integer id) {

        vehicleTypeRepository.deleteById(id);
    }
}
