package com.wcang;

import com.wcang.VehicleVisitor;

public abstract class Vehicle {
    protected int wheel;
    protected double price;
    protected String model;

    final public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }

    public abstract void honk();

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
