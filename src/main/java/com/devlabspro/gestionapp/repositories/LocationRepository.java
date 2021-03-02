package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
