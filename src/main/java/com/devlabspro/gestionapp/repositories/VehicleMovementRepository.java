package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {
}
