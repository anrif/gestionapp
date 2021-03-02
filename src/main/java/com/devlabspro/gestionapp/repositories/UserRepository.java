package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    User findByFirstnameAndLastname(String firstname, String lastname);
}
