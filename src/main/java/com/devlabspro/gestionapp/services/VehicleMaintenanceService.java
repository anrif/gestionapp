package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.VehicleMaintenance;
import com.devlabspro.gestionapp.repositories.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {
    @Autowired
    private VehicleMaintenanceRepository vehicleMaintenanceRepository;

    //Return list of vehicleMaintenances
    public List<VehicleMaintenance> getVehicleMaintenances(){

        return vehicleMaintenanceRepository.findAll();
    }

    //Save new vehicleMaintenance
    public void save(VehicleMaintenance vehicleMaintenance){

        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }

    //get by id
    public Optional<VehicleMaintenance> findById(int id){

        return  vehicleMaintenanceRepository.findById(id);
    }

    public void delete(Integer id) {

        vehicleMaintenanceRepository.deleteById(id);
    }
}
