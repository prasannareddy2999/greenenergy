package com.example.greenenergy.controller;

import com.example.greenenergy.entity.Energy;
import com.example.greenenergy.entity.GreenEnergy;
import com.example.greenenergy.entity.TraditionalEnergy;
import com.example.greenenergy.service.EnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnergyController {
    @Autowired
    EnergyService energyService;

    @PostMapping("/setGreenEnergyPrices")
    public void setGreenEnergyPrices(@RequestBody GreenEnergy greenEnergy)
    {
        energyService.setGreenEnergyPrices(greenEnergy);
    }

    @PostMapping("/setTraditionalEnergyPrices")
    public void setTraditionalEnergyPrices(@RequestBody TraditionalEnergy traditionalEnergy)
    {
        energyService.setTraditionalEnergyPrices(traditionalEnergy);
    }
}
