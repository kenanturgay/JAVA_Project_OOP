package com.projectOOP.org;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 120);
        System.out.println(vehicle.getBrand() + " " + vehicle.getModel() + " is going " + vehicle.getSpeed() + " km/h.");
        vehicle.accelerate(30);
        System.out.println("After accelerating: " + vehicle.getSpeed() + " km/h.");

        Car car = new Car("BMW", "Convertible", true, 2);
        car.openRoof();
        car.closeRoof();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", false);
        motorcycle.attachSidecar();
        motorcycle.detachSidecar();
    }
}