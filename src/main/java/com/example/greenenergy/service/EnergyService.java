package com.example.greenenergy.service;

import com.example.greenenergy.dao.GreenEnergyRepository;
import com.example.greenenergy.dao.TraditionalEnergyRepository;
import com.example.greenenergy.entity.GreenEnergy;
import com.example.greenenergy.entity.TraditionalEnergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergyService {
    @Autowired
    GreenEnergyRepository greenEnergyRepository;

    @Autowired
    TraditionalEnergyRepository traditionalEnergyRepository;

    public void setGreenEnergyPrices(GreenEnergy greenEnergy)
    {
        greenEnergyRepository.save(greenEnergy);
    }

    public void setTraditionalEnergyPrices(TraditionalEnergy traditionalEnergy)
    {
        traditionalEnergyRepository.save(traditionalEnergy);
    }

}
