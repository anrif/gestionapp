package com.devlabspro.gestionapp.controllers;

import com.devlabspro.gestionapp.models.VehicleMovement;
import com.devlabspro.gestionapp.services.VehicleMovementService;
import com.devlabspro.gestionapp.services.VehicleService;
import com.devlabspro.gestionapp.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleMovementController {
    @Autowired
    private VehicleMovementService vehicleMovementService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/vehicleMovements")
    public String getVehicleMovements(Model model){

        model.addAttribute("vehicleMovements", vehicleMovementService.getVehicleMovements());

        model.addAttribute("countries", vehicleService.getVehicles());

        model.addAttribute("locations", locationService.getLocations());

        return "vehicleMovement";
    }

    @PostMapping("/vehicleMovements/addNew")
    public String addNew(VehicleMovement vehicleMovement){
        vehicleMovementService.save(vehicleMovement);
        return  "redirect:/vehicleMovements";
    }

    @RequestMapping("vehicleMovements/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(int id){

        return vehicleMovementService.findById(id);
    }

    @RequestMapping(value="/vehicleMovements/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMovement vehicleMovement){
        vehicleMovementService.save(vehicleMovement);
        return  "redirect:/vehicleMovements";
    }

    @RequestMapping(value="/vehicleMovements/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        vehicleMovementService.delete(id);
        return  "redirect:/vehicleMovements";
    }
}
