package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
