package com.senlacourses.test;

import com.senlacourses.flowershop.*;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Test {
    public static void main(String[] args) {
        Rose chinaRose = new Rose("China Rose", 12.9);
        Rose doubleDelightRose = new Rose("Double Delight", 25.1);
        Lily asianLily = new Lily("Asian Lily", 99.9);
        Chamomile chrysanthemumLeucanthemum = new Chamomile("Chrysanthemum leucanthemum", 10.1);
        Tulip candyPrince = new Tulip("Candy Prince", 199.9);

        AFlower[] flowers = {chinaRose, doubleDelightRose, asianLily, chrysanthemumLeucanthemum, candyPrince};

        Bouquet bouquet = new Bouquet(flowers);
        System.out.println("Bouquet total cost: " + bouquet.getCost());

    }
}
