package com.example.greenenergy.dao;


import com.example.greenenergy.entity.GreenEnergy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreenEnergyRepository extends JpaRepository<GreenEnergy,Long> {
}
