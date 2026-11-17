package com.parking.parkinlot.common;

import com.parking.parkinlot.entities.Car;
import jakarta.ejb.EJBException;
import jakarta.persistence.TypedQuery;

import java.util.List;


public class CarDto {

    Long id;
    String licensePlate;
    String parkingSpot;
    String ownerName;

    public CarDto(Long id, String licensePlate, String parkingSpot, String ownerName) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.parkingSpot = parkingSpot;
        this.ownerName = ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public Long getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }


}
