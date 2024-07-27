package com.example.greenenergy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TraditionalEnergy {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String Region;
    float coalEnergy;
    float oilEnergy;
    float naturalgasEnergy;
    float NuclearEnergy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public float getCoalEnergy() {
        return coalEnergy;
    }

    public void setCoalEnergy(float coalEnergy) {
        this.coalEnergy = coalEnergy;
    }

    public float getOilEnergy() {
        return oilEnergy;
    }

    public void setOilEnergy(float oilEnergy) {
        this.oilEnergy = oilEnergy;
    }

    public float getNaturalgasEnergy() {
        return naturalgasEnergy;
    }

    public void setNaturalgasEnergy(float naturalgasEnergy) {
        this.naturalgasEnergy = naturalgasEnergy;
    }

    public float getNuclearEnergy() {
        return NuclearEnergy;
    }

    public void setNuclearEnergy(float nuclearEnergy) {
        NuclearEnergy = nuclearEnergy;
    }

    @Override
    public String toString() {
        return "TraditionalEnergy{" +
                "id=" + id +
                ", Region='" + Region + '\'' +
                ", coalEnergy=" + coalEnergy +
                ", oilEnergy=" + oilEnergy +
                ", naturalgasEnergy=" + naturalgasEnergy +
                ", NuclearEnergy=" + NuclearEnergy +
                '}';
    }
}
