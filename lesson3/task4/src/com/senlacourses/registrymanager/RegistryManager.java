package com.senlacourses.registrymanager;

import com.senlacourses.beans.Doctor;
import com.senlacourses.beans.Patient;
import com.senlacourses.checker.Checker;
import com.senlacourses.registry.Registry;

import java.util.ArrayList;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class RegistryManager {
    private Registry registry=Registry.getInstance();
    private Checker checker=new Checker();

    public void visitToTheDoctor(int idCard, String doctorFirstName, String doctorLastName){
        if(checker.patientIsRegistered(idCard)){
            if(checker.doctorWorking(doctorFirstName,doctorLastName)){
                Doctor doctor=checker.getDoctorForVisit(doctorFirstName,doctorLastName);
                Patient patient=checker.getPatientForVisit(idCard);
                doctor.addPatientToList(patient);
                System.out.println("You are registered at the reception");

            }

        }else {
            System.out.println("there is no such patient in the database");
        }

    }
    public void addNewPatient(String fName, String lName,int age){
       registry.addPatient(fName,lName,age);
    }
    public void addNewDoctor(String fName, String lName,int age,String specialization){
        registry.addDoctor(fName,lName,age,specialization);
    }
    public void showAllDoctors(){
        ArrayList<Doctor> doctors=registry.getAllDoctors();
        for(Doctor doctor:doctors){
            System.out.println(doctor.getfName()+", "+doctor.getlName()+", "+doctor.getSpecialization());
        }
    }
    public void showAllPatients(){
        ArrayList<Patient>patients=registry.getAllPatients();
        for(Patient patient:patients){
            System.out.println(patient.getIdCard()+", "+patient.getfName()+", "+patient.getlName()+", "+patient.getAge());
        }
    }
    public void getPatientsByDoctor(String docfName,String doclName) {
        Doctor doctor=checker.getDoctorByName(docfName,doclName);
        ArrayList<Patient> patients=doctor.getPatientList();
        for(Patient patient:patients){
            System.out.println(patient.getfName()+", "+patient.getlName());
        }
    }
    }

