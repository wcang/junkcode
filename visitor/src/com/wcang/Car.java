package com.wcang;

public class Car extends Vehicle {
    Car(String model, double price) {
        wheel = 4;
        this.price = price;
        this.model = model;
    }

    @Override
    public void honk() {
        System.out.println("HONK");
    }
}
