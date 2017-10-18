package com.senlacourses.registry;

import com.senlacourses.beans.Doctor;
import com.senlacourses.beans.Patient;

import java.util.ArrayList;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Registry {
    private static Registry registry=new Registry();

    private Registry() {
    }
    public static Registry getInstance(){
        return registry;
    }

    private ArrayList<Patient> patients=new ArrayList<>();
    private ArrayList<Doctor> doctors=new ArrayList<>();

    public void addPatient(String fName,String lName,int age){
        Patient patient=new Patient(fName,lName,age);
        patients.add(patient);
    }
    public ArrayList<Patient> getAllPatients(){
        return patients;
    }

    public void addDoctor(String fName,String lName,int age,String specialization){
        Doctor doctor=new Doctor(fName,lName,age,specialization);
        doctors.add(doctor);
    }
    public ArrayList<Doctor> getAllDoctors(){
        return doctors;
    }
}
