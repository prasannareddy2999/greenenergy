package com.example.greenenergy.dao;

import com.example.greenenergy.entity.TraditionalEnergy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraditionalEnergyRepository extends JpaRepository<TraditionalEnergy,Long> {
}
