package com.mrtlptkn.A4_Polymorphism;

public class Taxi extends Vehicle {

    @Override
    public void transport() {
        System.out.println("Passengers are being transported by taxi");
    }

    // Taxi yolcu alır
    public void pickUpPassenger() {
        System.out.println("Taxi is picking up a passenger");
    }

}
