package com.senlacourse.line.api;

import com.senlacourse.line.entity.Body;
import com.senlacourse.line.entity.Chassis;
import com.senlacourse.line.entity.Engine;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public interface IProduct {
    void installFirstPart(IProductPart firstProductPart);
    void installSecondPart(IProductPart secondProductPart);
    void installThirdtPart(IProductPart thirdProductPart);
}
