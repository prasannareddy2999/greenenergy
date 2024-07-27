package com.example.greenenergy.service;

import com.example.greenenergy.dao.EnergyRepository;
import com.example.greenenergy.dao.UserRepository;
import com.example.greenenergy.entity.Energy;
import com.example.greenenergy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    EnergyRepository energyRepository;
    @Autowired
    UserRepository userRepository;
    public User getUserDetails(Long userId)
    {
        Optional<User> userOptional=userRepository.findById(userId);
        if(userOptional.isPresent())
        {
            User user= userOptional.get();
            return user;
        }
        return null;

    }

    public List<Energy> getEnergyDetails(Long userId)
    {
        return energyRepository.findAllByUserId(userId);
    }

    public void storeUser(User user)
    {
        Optional<Energy> energyOptional=Optional.of(user.getEnergyDetails());
        if(energyOptional.isPresent()) {
            energyRepository.save(energyOptional.get());
        }
        userRepository.save(user);
    }

    public void storeEnergy(Energy energy)
    {
        energyRepository.save(energy);
        Optional<User> userOptional
                =userRepository.findById(energy.getId());
        if(userOptional.isPresent())
        {
            userOptional.get().setEnergyDetails(energy);
        }
    }




}
