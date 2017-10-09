package com.senlacourse.line.assemblyline;

import com.senlacourse.line.api.ILineStep;
import com.senlacourse.line.api.IProductPart;
import com.senlacourse.line.entity.Engine;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class EngineLineStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {

        return new Engine("diesel",1.9,170);
    }
}
