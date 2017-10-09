package com.senlacourse.line.assemblyline;

import com.senlacourse.line.api.ILineStep;
import com.senlacourse.line.api.IProductPart;
import com.senlacourse.line.entity.Body;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class BodyLineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        return new Body(98722,"sedan","black");
    }
}
