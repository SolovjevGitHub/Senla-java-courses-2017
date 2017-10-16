package com.senlacouses.test;

import com.senlacouses.randomnumber.RandomNumber;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Test {
    public static void main(String[] args){
        RandomNumber randomNumber=new RandomNumber();
        int number=randomNumber.createRandomNumber();
        System.out.println("Random number: "+number);
        System.out.println("Max number from random "+randomNumber.maxNumber(number));
    }
}
