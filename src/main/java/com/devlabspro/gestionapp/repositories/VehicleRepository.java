package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
