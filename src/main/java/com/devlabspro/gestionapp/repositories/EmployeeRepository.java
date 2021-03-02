package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByUsername(String un);
}
