package com.example.greenenergy.dao;

import com.example.greenenergy.entity.Energy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EnergyRepository extends JpaRepository<Energy,Long> {

    @Query("SELECT e FROM Energy e WHERE e.userId = :userId")
    List<Energy> findAllByUserId(@Param("userId") Long userId);


}
