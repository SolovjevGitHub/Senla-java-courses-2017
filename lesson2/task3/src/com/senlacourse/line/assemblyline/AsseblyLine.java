package com.senlacourse.line.assemblyline;

import com.senlacourse.line.api.IAssemblyLine;
import com.senlacourse.line.api.IProduct;
import com.senlacourse.line.entity.Body;
import com.senlacourse.line.entity.Chassis;
import com.senlacourse.line.entity.Engine;
import com.senlacourse.line.entity.Product;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class AsseblyLine implements IAssemblyLine {

    private Body body;
    private Chassis chassis;
    private Engine engine;

    public AsseblyLine(Body body, Chassis chassis, Engine engine){
        this.body=body;
        this.chassis=chassis;
        this.engine=engine;
    };


    @Override
    public IProduct assembleProduct(IProduct iProduct) {


        iProduct.installFirstPart(body);
        iProduct.installSecondPart(chassis);
        iProduct.installThirdtPart(engine);

        System.out.println("Product is created!");
        System.out.println(iProduct.toString());

        return iProduct;
    }
}
