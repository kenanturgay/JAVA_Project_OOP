package com.projectOOP.org;

public class Motorcycle extends Vehicle {

    boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    public void attachSidecar() {
        if (!hasSidecar) { // Eğer henüz yoksa sidecar ekleniyor.
            System.out.println("Attaching the sidecar.");
            hasSidecar = true; // Sidecar eklenmiş olur.
        } else {
            System.out.println("There is already a sidecar attached.");
        }
    }

    public void detachSidecar() {
        if (hasSidecar) {
            System.out.println("Detaching the sidecar.");
            hasSidecar = false; // Sidecar çıkarılmış olur.
        } else {
            System.out.println("There is no sidecar to detach.");
        }
    }
}
