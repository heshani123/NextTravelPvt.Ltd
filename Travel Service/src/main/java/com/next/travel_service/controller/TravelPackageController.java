package com.next.travel_service.controller;

import com.next.travel_service.entity.TravelPackage;
import com.next.travel_service.service.TravelPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/packages")
public class TravelPackageController {
    @Autowired
    private TravelPackageService travelPackageService;

    @PostMapping(value = "/add")
    public TravelPackage addTravelPackage(@RequestBody TravelPackage travelPackage) {
        return travelPackageService.addTravelPackage(travelPackage);
    }

    @GetMapping(value = "/get")
    public List<TravelPackage> fetchAllPackages(){
        return travelPackageService.fetchAllPackages();
    }

}
