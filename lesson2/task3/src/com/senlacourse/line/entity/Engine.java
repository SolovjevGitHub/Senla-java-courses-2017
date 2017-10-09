package com.senlacourse.line.entity;

import com.senlacourse.line.api.IProductPart;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Engine implements IProductPart {

    private String fuelType;
    private double volume;
    private int power;

    public Engine(String fuelType, double volume, int power) {
        this.fuelType = fuelType;
        this.volume = volume;
        this.power = power;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
