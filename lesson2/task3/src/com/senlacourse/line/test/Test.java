package com.senlacourse.line.test;

import com.senlacourse.line.api.IAssemblyLine;
import com.senlacourse.line.assemblyline.AsseblyLine;
import com.senlacourse.line.assemblyline.BodyLineStep;
import com.senlacourse.line.assemblyline.ChassisLineStep;
import com.senlacourse.line.assemblyline.EngineLineStep;
import com.senlacourse.line.entity.Body;
import com.senlacourse.line.entity.Chassis;
import com.senlacourse.line.entity.Engine;
import com.senlacourse.line.entity.Product;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Test {
    public static void main(String[] args){
        BodyLineStep bodyLineStep = new BodyLineStep();
        ChassisLineStep chassisLineStep = new ChassisLineStep();
        EngineLineStep engineLineStep = new EngineLineStep();

        IAssemblyLine iAssemblyLine = new AsseblyLine((Body) bodyLineStep.buildProductPart(),(Chassis) chassisLineStep.buildProductPart(), (Engine) engineLineStep.buildProductPart());
        iAssemblyLine.assembleProduct(new Product());


    }
}
