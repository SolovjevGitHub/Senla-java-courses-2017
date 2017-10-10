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
    @Override
    public IProduct assembleProduct(IProduct iProduct) {
        Product product=(Product)iProduct;

        BodyLineStep bodyLineStep = new BodyLineStep();
        ChassisLineStep chassisLineStep = new ChassisLineStep();
        EngineLineStep engineLineStep = new EngineLineStep();

        Body body = (Body) bodyLineStep.buildProductPart();
        Chassis chassis = (Chassis) chassisLineStep.buildProductPart();
        Engine engine = (Engine) engineLineStep.buildProductPart();

        product.installFirstPart(body);
        product.installSecondPart(chassis);
        product.installThirdtPart(engine);

        System.out.println("Product is created!");
        System.out.println(product.toString());

        return new Product();
    }
}
