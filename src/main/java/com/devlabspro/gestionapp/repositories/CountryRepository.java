package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
