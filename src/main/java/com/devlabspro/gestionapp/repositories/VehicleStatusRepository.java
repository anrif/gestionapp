package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {
}
