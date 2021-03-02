package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}
