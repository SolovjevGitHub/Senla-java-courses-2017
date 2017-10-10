package com.senlacourse.line.entity;

import com.senlacourse.line.api.IProductPart;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Chassis implements IProductPart {
    private int chassisNumber;
    private String chassisMaker;

    public Chassis(int chassisNumber, String chassisMaker) {
        this.chassisNumber = chassisNumber;
        this.chassisMaker = chassisMaker;
    }

    public int getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(int chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getChassisMaker() {
        return chassisMaker;
    }

    public void setChassisMaker(String chassisMaker) {
        this.chassisMaker = chassisMaker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chassis{");
        sb.append("chassisNumber=").append(chassisNumber);
        sb.append(", chassisMaker='").append(chassisMaker).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
