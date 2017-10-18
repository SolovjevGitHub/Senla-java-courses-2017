package com.senlacourses.test;

import com.senlacourses.registrymanager.RegistryManager;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Test {
    public static void main(String[] args) {
        RegistryManager registryManager = new RegistryManager();


        registryManager.addNewDoctor("House", "House", 45, "terapevt");
        registryManager.addNewDoctor("Who", "Petrovich", 35, "hirurg");

        registryManager.addNewPatient("Serg", "Solovyev", 28);
        registryManager.addNewPatient("Maria", "Pedro", 88);
        registryManager.addNewPatient("Huanita", "Ismeralda", 101);

        registryManager.showAllDoctors();
        registryManager.showAllPatients();

        registryManager.visitToTheDoctor(1,"House","House");
        registryManager.visitToTheDoctor(2,"House","House");
        registryManager.visitToTheDoctor(3,"House","House");

        registryManager.getPatientsByDoctor("House","House");
    }
}
