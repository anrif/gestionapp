package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.Employee;
import com.devlabspro.gestionapp.models.User;
import com.devlabspro.gestionapp.repositories.EmployeeRepository;
import com.devlabspro.gestionapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    //Return list of employees
    public List<Employee> getEmployees(){

        return employeeRepository.findAll();
    }

    //Save new employee
    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    //get by id
    public Optional<Employee> findById(int id){

        return  employeeRepository.findById(id);
    }

    public void delete(Integer id) {

        employeeRepository.deleteById(id);
    }

    public Employee findByUsername(String un) {
        return employeeRepository.findByUsername(un);
    }


    //Set the username of the employee where firstname and lastname match
    public void assignUsername(int id){
        Employee employee = employeeRepository.findById(id).orElse(null);
        User user = userRepository.findByFirstnameAndLastname(
                employee.getFirstname(),
                employee.getLastname());

        employee.setUsername(user.getUsername());
        employeeRepository.save(employee);
    }
}
