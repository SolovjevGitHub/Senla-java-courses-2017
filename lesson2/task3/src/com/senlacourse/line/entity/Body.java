package com.senlacourse.line.entity;

import com.senlacourse.line.api.IProductPart;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class Body implements IProductPart{
    private int bodyCode;
    private String bodyType;
    private String bodyColor;

    public Body(int bodyCode, String bodyType, String bodyColor) {
        this.bodyCode = bodyCode;
        this.bodyType = bodyType;
        this.bodyColor = bodyColor;
    }

    public int getBodyCode() {
        return bodyCode;
    }

    public void setBodyCode(int bodyCode) {
        this.bodyCode = bodyCode;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Body{");
        sb.append("bodyCode=").append(bodyCode);
        sb.append(", bodyType='").append(bodyType).append('\'');
        sb.append(", bodyColor='").append(bodyColor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
