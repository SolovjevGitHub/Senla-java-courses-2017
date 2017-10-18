package com.senlacourses.beans;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Patient extends APerson{
    private int idCard;
    private static int count=0;

    public Patient(String fName, String lName, int age) {
        super(fName, lName, age);
        setIdCard();
        count++;
    }

    public int getIdCard() {

        return idCard;
    }

    private void setIdCard() {
        this.idCard = count+1;
    }

    public static int getCount() {
        return count;
    }
}
