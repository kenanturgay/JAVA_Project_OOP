package com.projectOOP.org;

public class Vehicle {

    String brand;
    String model;
    double speed;


    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String brand, String model, double speed) {
        this(brand, model); // constructor chaining
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate(double amount) {

        if (amount > 0) {

            this.speed += amount;
        }

    }

    public void brake(double amount) {
        if (amount > 0) {
            this.speed -= amount;
            if (this.speed < 0) {
                this.speed = 0;
            }
        }


    }
}
