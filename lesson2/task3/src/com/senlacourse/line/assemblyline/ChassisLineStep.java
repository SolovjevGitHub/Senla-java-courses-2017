package com.senlacourse.line.assemblyline;

import com.senlacourse.line.api.ILineStep;
import com.senlacourse.line.api.IProductPart;
import com.senlacourse.line.entity.Chassis;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class ChassisLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new Chassis(967,"BMW");
    }
}
