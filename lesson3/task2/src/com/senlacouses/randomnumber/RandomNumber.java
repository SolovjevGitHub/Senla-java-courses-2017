package com.senlacouses.randomnumber;

import java.util.Arrays;
import java.util.Random;

import static java.lang.String.valueOf;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class RandomNumber {
    public int createRandomNumber(){
        Random random = new Random();
        int number = 100 + random.nextInt(999 - 100);
        return number;
    }
    public char maxNumber(int randomNumber){
        char [] array=(String.valueOf(randomNumber)).toCharArray();
        Arrays.sort(array);



        return array[2];
    }
}
