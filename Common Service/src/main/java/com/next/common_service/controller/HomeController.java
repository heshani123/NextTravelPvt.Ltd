package com.next.common_service.controller;

import com.next.common_service.dto.TravelPackageDTO;
import com.next.common_service.dto.UserDTO;
import com.next.common_service.service.TravelPackageService;
import com.next.common_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private TravelPackageService travelPackageService;
    @Autowired
    private UserService userService;

    @GetMapping("/get-packages")
    public List<TravelPackageDTO> getAllPackages(){
        return travelPackageService.getAllTravelPackages();
    }

    @GetMapping(value = "/login")
    public Boolean checkLogin(@RequestParam String userName, @RequestParam String password){
        return userService.checkLogin(userName, password);
    }

    @PostMapping(value = "/create-user")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

//    @GetMapping("/get-vehicles")
//    public List<TravelPackageDTO> getAllVehiclesByType(){
//        return travelPackageService.getAllTravelPackages();
//    }
}
