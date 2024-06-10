package com.example.form.controller;

import com.example.form.entity.VehicleInfo;
import com.example.form.repository.VehicleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/api/form")
@RestController
public class FormController {

    @Autowired
    private VehicleInfoRepository repository;



    @PostMapping("/submit")
    public VehicleInfo createVehicleInfo(@RequestBody VehicleInfo vehicleInfo) {
        return repository.save(vehicleInfo);
    }

    @GetMapping("/getall")
    public List<VehicleInfo> getAllVehicleInfo() {
        return repository.findAll();
    }


}
