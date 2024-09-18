package com.projectOOP.org;

public class Car extends Vehicle {

    boolean isConvertible;
    int numberOfDoors;

    Car(String brand, String model, boolean isConvertible, int numberOfDoors) {
        super(brand, model);
        this.isConvertible = isConvertible;
        this.numberOfDoors = numberOfDoors;
    }
   public void openRoof(){
        if(isConvertible){
            System.out.println("Opening the roof.");
        }else {
            System.out.println("This car is not a convertible.");
        }
   }

   public void closeRoof(){

       if(isConvertible){
           System.out.println("Closing the roof.");
       }else {
           System.out.println("This car is not a convertible.");
       }

   }

}
