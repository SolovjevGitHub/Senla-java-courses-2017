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
        System.out.println("first part is installed!");

    }

    @Override
    public void installSecondPart(IProductPart secondProductPart) {
        System.out.println("second part is installed!");

    }

    @Override
    public void installThirdtPart(IProductPart thirdProductPart) {
        System.out.println("third part is installed!");

    }
}
