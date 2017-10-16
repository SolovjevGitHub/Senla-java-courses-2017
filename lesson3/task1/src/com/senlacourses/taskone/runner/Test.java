package com.senlacourses.taskone.runner;

import com.senlacourses.taskone.arraycontroller.ArrayController;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Test {
    public static void main(String [] args){

        ArrayController arrayController=new ArrayController();
        int[] array=arrayController.createArray(5);
        System.out.println("new array: "+arrayController.arrayToString(array));
        System.out.println("summ: "+arrayController.sumArray(array));

    }
}
