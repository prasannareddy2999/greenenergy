package com.example.greenenergy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Energy {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    Date date;
    Long userId;
    Long energySaved;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getEnergySaved() {
        return energySaved;
    }

    public void setEnergySaved(Long energySaved) {
        this.energySaved = energySaved;
    }

    @Override
    public String toString() {
        return "Energy{" +
                "id=" + id +
                ", date=" + date +
                ", userId=" + userId +
                ", energySaved=" + energySaved +
                '}';
    }
}
