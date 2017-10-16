package com.senlacourses.flowershop;

import java.util.Arrays;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Bouquet {
    private double cost;
    private AFlower[] bouquet;

    public Bouquet (AFlower[] flowers){
        this.bouquet=flowers;
        setCost(flowers);
        System.out.println("Create bouquet: "+ Arrays.toString(flowers));

    }

    public double getCost() {
        return cost;
    }

    private double setCost(AFlower[] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            cost += bouquet[i].getCost();
        }
        return cost;
    }
}
