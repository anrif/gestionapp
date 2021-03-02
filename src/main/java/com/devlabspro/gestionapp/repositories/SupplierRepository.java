package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
