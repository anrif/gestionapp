package com.devlabspro.gestionapp.controllers;

import com.devlabspro.gestionapp.models.VehicleStatus;
import com.devlabspro.gestionapp.services.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleStatusController {
    @Autowired
    private VehicleStatusService vehicleStatusService;

    @GetMapping("/vehicleStatuses")
    public String getVehicleStatus(Model model){

        List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatuses();
        model.addAttribute("vehicleStatus", vehicleStatusList);


        return "vehicleStatus";
    }

    @PostMapping("/vehicleStatuses/addNew")
    public String addNew(VehicleStatus vehicleStatus){
        vehicleStatusService.save(vehicleStatus);
        return  "redirect:/vehicleStatuses";
    }

    @RequestMapping("vehicleStatuses/findById")
    @ResponseBody
    public Optional<VehicleStatus> findById(int id){

        return vehicleStatusService.findById(id);
    }

    @RequestMapping(value="/vehicleStatuses/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleStatus vehicleStatus){
        vehicleStatusService.save(vehicleStatus);
        return  "redirect:/vehicleStatuses";
    }

    @RequestMapping(value="/vehicleStatuses/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        vehicleStatusService.delete(id);
        return  "redirect:/vehicleStatuses";
    }
}
