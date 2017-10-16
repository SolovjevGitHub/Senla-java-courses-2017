package com.senlacourses.taskone.arraycontroller;

import java.util.Arrays;
import java.util.Random;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class ArrayController {
    public int[] createArray(int arrayLenght) {
        int[] array = new int[arrayLenght];
        Random random = new Random();

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
    public String arrayToString(int[] array){
        return Arrays.toString(array);
    }
    public int sumArray(int[] array){
        int summ=0;
        for(int i=0;i<array.length;i++){
            summ+=array[i];
        }
        return summ;
    }

}
