package com.devlabspro.gestionapp.controllers;

import com.devlabspro.gestionapp.models.VehicleMake;
import com.devlabspro.gestionapp.services.VehicleMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleMakeController {
    @Autowired
    private VehicleMakeService vehicleMakeService;

    @GetMapping("/vehicleMakes")
    public String getVehicleMakes(Model model){

        List<VehicleMake> vehicleMakeList = vehicleMakeService.getVehicleMakes();
        model.addAttribute("vehicleMakes", vehicleMakeList);

        return "vehicleMake";
    }

    @PostMapping("/vehicleMakes/addNew")
    public String addNew(VehicleMake vehicleMake){
        vehicleMakeService.save(vehicleMake);
        return  "redirect:/vehicleMakes";
    }

    @RequestMapping("vehicleMakes/findById")
    @ResponseBody
    public Optional<VehicleMake> findById(int id){

        return vehicleMakeService.findById(id);
    }

    @RequestMapping(value="/vehicleMakes/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMake vehicleMake){
        vehicleMakeService.save(vehicleMake);
        return  "redirect:/vehicleMakes";
    }

    @RequestMapping(value="/vehicleMakes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        vehicleMakeService.delete(id);
        return  "redirect:/vehicleMakes";
    }
}
