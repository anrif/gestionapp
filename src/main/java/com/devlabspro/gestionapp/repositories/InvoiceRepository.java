package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
