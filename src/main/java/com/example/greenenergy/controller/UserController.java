package com.example.greenenergy.controller;

import com.example.greenenergy.dao.EnergyRepository;
import com.example.greenenergy.dao.UserRepository;
import com.example.greenenergy.entity.Energy;
import com.example.greenenergy.entity.User;
import com.example.greenenergy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable("userId") Long userId)
    {
        return userService.getUserDetails(userId);
    }

    @GetMapping("/getEnergyByUser/{userId}")
    public List<Energy> getEnergyByUser(@PathVariable("userId") Long userId)
    {
        return userService.getEnergyDetails(userId);
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user)
    {
         userService.storeUser(user);
    }

    @PostMapping("/saveEnergy")
    public void saveEnergy(@RequestBody Energy energy)
    {
        userService.storeEnergy(energy);
    }



}
