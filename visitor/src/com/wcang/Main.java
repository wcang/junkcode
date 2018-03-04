package com.wcang;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motorbike("Yamaha", 10_000));
        vehicles.add(new Car("Kia", 25_000));
        vehicles.add(new Car("Ferrari", 500_000.55));
        vehicles.add(new Motorbike("BMW", 25_999.99));
        vehicles.add(new Motorbike("Honda Repsol", 125_000));

        BikeVisitor visitor = new BikeVisitor();

        for (Vehicle vehicle: vehicles) {
            vehicle.accept(visitor);
        }

        System.out.println("Total price for bikes is " + visitor.sum());
    }
}
