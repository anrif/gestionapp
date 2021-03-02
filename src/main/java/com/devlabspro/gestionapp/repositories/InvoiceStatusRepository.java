package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {
}
