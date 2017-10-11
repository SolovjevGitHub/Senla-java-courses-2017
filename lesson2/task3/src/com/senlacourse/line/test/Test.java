package com.senlacourse.line.test;

import com.senlacourse.line.assemblyline.AsseblyLine;
import com.senlacourse.line.assemblyline.BodyLineStep;
import com.senlacourse.line.assemblyline.ChassisLineStep;
import com.senlacourse.line.assemblyline.EngineLineStep;
import com.senlacourse.line.entity.Product;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Test {
    public static void main(String[] args){
        Product product=new Product();
        AsseblyLine asseblyLine=new AsseblyLine(new BodyLineStep(),new ChassisLineStep(),new EngineLineStep());
        asseblyLine.assembleProduct(product);


    }
}
