package com.devlabspro.gestionapp.controllers;

import com.devlabspro.gestionapp.models.Employee;
import com.devlabspro.gestionapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @Autowired
    private StateService stateService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private JobTitleService jobTitleService;


    @GetMapping("/employees")
    public String getEmployees(Model model){

        model.addAttribute("employees", employeeService.getEmployees());

        model.addAttribute("employeeTypes",employeeTypeService.getEmployeeTypes());

        model.addAttribute("states",stateService.getStates());

        model.addAttribute("countries",countryService.getCountries());

        model.addAttribute("jobTitles",jobTitleService.getJobTitles());


        return "employee";
    }

    @PostMapping("/employees/addNew")
    public String addNew(Employee employee){
        employeeService.save(employee);
        return  "redirect:/employees";
    }

    @RequestMapping("employees/findById")
    @ResponseBody
    public Optional<Employee> findById(int id){

        return employeeService.findById(id);
    }

    @RequestMapping(value="/employees/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Employee employee){
        employeeService.save(employee);
        return  "redirect:/employees";
    }

    @RequestMapping(value="/employees/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        employeeService.delete(id);
        return  "redirect:/employees";
    }

    //Assign Employee Username
    @RequestMapping(value = "/employees/assignUsername")
    public  String assignUsername(int id){
        employeeService.assignUsername(id);
        return "redirect:/employees";
    }
}
