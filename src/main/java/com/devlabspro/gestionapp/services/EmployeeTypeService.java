package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.EmployeeType;
import com.devlabspro.gestionapp.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    //Return list of employeeTypes
    public List<EmployeeType> getEmployeeTypes(){

        return employeeTypeRepository.findAll();
    }

    //Save new employeeType
    public void save(EmployeeType employeeType){

        employeeTypeRepository.save(employeeType);
    }

    //get by id
    public Optional<EmployeeType> findById(int id){

        return  employeeTypeRepository.findById(id);
    }

    public void delete(Integer id) {

        employeeTypeRepository.deleteById(id);
    }

}
