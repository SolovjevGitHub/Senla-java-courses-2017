package com.senlacourses.checker;

import com.senlacourses.beans.Doctor;
import com.senlacourses.beans.Patient;
import com.senlacourses.registry.Registry;

import java.util.ArrayList;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Checker {
    private Registry registry = Registry.getInstance();


    public boolean patientIsRegistered(int idCard) {
        boolean isRegistered = false;
        ArrayList<Patient>patients=registry.getAllPatients();
        for (Patient patient : patients) {
            if (patient.getIdCard() == idCard) {
                isRegistered = true;
            }
        }
        return isRegistered;
    }

    public boolean doctorWorking(String fName, String lName) {
        boolean doctorWorking = false;
        ArrayList<Doctor> doctors = registry.getAllDoctors();
        for (Doctor doctor : doctors) {
            if (doctor.getfName().equalsIgnoreCase(fName) && doctor.getlName().equalsIgnoreCase(lName)) {
                doctorWorking = true;
            }
        }
        return doctorWorking;
    }

    public Patient getPatientForVisit(int idCard) {
        ArrayList<Patient> patients = registry.getAllPatients();
        Patient patientt = null;
        for (Patient patient : patients) {
            if (patient.getIdCard() == idCard) {
                patientt = patient;
            }

        }return patientt;
    }

    public Doctor getDoctorForVisit(String fName, String lName) {
        ArrayList<Doctor> doctors = registry.getAllDoctors();
        Doctor doc = null;

        for (Doctor doctor : doctors) {
            if (doctor.getfName().equalsIgnoreCase(fName) && doctor.getlName().equalsIgnoreCase(lName)) {
                doc = doctor;
            }
        }
        return doc;
    }

    public Doctor getDoctorByName(String docfName, String doclName){
        ArrayList<Doctor> doctors=registry.getAllDoctors();
        Doctor doc=null;
        for (Doctor doctor:doctors){

                if (doctor.getfName().equalsIgnoreCase(docfName) && doctor.getlName().equalsIgnoreCase(doclName)) {
                  doc=doctor;
                }

        }
        if(doc==null){
            System.out.println("Doctor not found");
        }
        return doc;
    }
}






