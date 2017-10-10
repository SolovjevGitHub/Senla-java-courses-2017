package com.senlacourse.line.entity;

import com.senlacourse.line.api.IProduct;
import com.senlacourse.line.api.IProductPart;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Product implements IProduct {
    private Body body;
    private Chassis chassis;
    private Engine engine;

    @Override
    public void installFirstPart(IProductPart firstProductPart) {
        body=(Body)firstProductPart;
        System.out.println("first part 'Body' is installed!");

    }

    @Override
    public void installSecondPart(IProductPart secondProductPart) {
        chassis=(Chassis)secondProductPart;
        System.out.println("second part 'Chassis' is installed!");

    }

    @Override
    public void installThirdtPart(IProductPart thirdProductPart) {
        engine=(Engine) thirdProductPart;
        System.out.println("third part 'Engine' is installed!");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("body=").append(body);
        sb.append(", chassis=").append(chassis);
        sb.append(", engine=").append(engine);
        sb.append('}');
        return sb.toString();
    }
}
