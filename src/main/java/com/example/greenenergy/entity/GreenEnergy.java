package com.example.greenenergy.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GreenEnergy {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String region;


    float solarEnergy;
    float windEnergy;

    float hydroEnergy;
    float geothermalEnergy;

    float biomassEnergy;

    float tidalEnergy;

    float waveEnergy;
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getSolarEnergy() {
        return solarEnergy;
    }

    public void setSolarEnergy(float solarEnergy) {
        this.solarEnergy = solarEnergy;
    }

    public float getWindEnergy() {
        return windEnergy;
    }

    public void setWindEnergy(float windEnergy) {
        this.windEnergy = windEnergy;
    }

    public float getHydroEnergy() {
        return hydroEnergy;
    }

    public void setHydroEnergy(float hydroEnergy) {
        this.hydroEnergy = hydroEnergy;
    }

    public float getGeothermalEnergy() {
        return geothermalEnergy;
    }

    public void setGeothermalEnergy(float geothermalEnergy) {
        this.geothermalEnergy = geothermalEnergy;
    }

    public float getBiomassEnergy() {
        return biomassEnergy;
    }

    public void setBiomassEnergy(float biomassEnergy) {
        this.biomassEnergy = biomassEnergy;
    }

    public float getTidalEnergy() {
        return tidalEnergy;
    }

    public void setTidalEnergy(float tidalEnergy) {
        this.tidalEnergy = tidalEnergy;
    }

    public float getWaveEnergy() {
        return waveEnergy;
    }

    public void setWaveEnergy(float waveEnergy) {
        this.waveEnergy = waveEnergy;
    }

    @Override
    public String toString() {
        return "GreenEnergy{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", solarEnergy=" + solarEnergy +
                ", windEnergy=" + windEnergy +
                ", hydroEnergy=" + hydroEnergy +
                ", geothermalEnergy=" + geothermalEnergy +
                ", biomassEnergy=" + biomassEnergy +
                ", tidalEnergy=" + tidalEnergy +
                ", waveEnergy=" + waveEnergy +
                '}';
    }
}
