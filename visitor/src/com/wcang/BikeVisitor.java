package com.wcang;

public class BikeVisitor implements VehicleVisitor {
    double sum = 0;
    @Override
    public void visit(final Vehicle vehicle) {
        if (vehicle instanceof Motorbike) {
            System.out.println(String.format("Model %s price %f", vehicle.getModel(), vehicle.getPrice()));
            sum += vehicle.getPrice();
        }
    }

    public double sum() {
        return sum;
    }
}
