package com.wcang;

public class Motorbike extends Vehicle {
    Motorbike(String model, double price) {
        wheel = 2;
        this.price = price;
        this.model = model;
    }

    @Override
    public void honk() {
        System.out.println("Beep");
    }
}
