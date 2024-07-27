package com.example.greenenergy.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long userId;
    String userName;
    String userLocation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "energyId", referencedColumnName = "id")
    Energy energyDetails;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public Energy getEnergyDetails() {
        return energyDetails;
    }

    public void setEnergyDetails(Energy energyDetails) {
        this.energyDetails = energyDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", userLocation=" + userLocation +
                ", energyDetails=" + energyDetails +
                '}';
    }
}
