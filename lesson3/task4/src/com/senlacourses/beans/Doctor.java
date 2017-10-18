package com.senlacourses.beans;

import java.util.ArrayList;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Doctor extends APerson {
    private static int count=0;
    private int id;
    private String specialization;
    private ArrayList<Patient> patientList=new ArrayList<>();

    public Doctor(String fName, String lName, int age, String specialization) {
        super(fName, lName, age);
        this.specialization = specialization;
        count++;
    }

    public static int getCount() {
        return count;
    }



    public int getId() {
        return id;
    }

    private void setId() {
        this.id = count;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void addPatientToList(Patient patient) {
        patientList.add(patient);
    }
}
