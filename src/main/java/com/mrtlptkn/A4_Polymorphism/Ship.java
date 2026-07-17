package com.mrtlptkn.A4_Polymorphism;

public class Ship extends Vehicle {

    @Override
    public void transport() {
        System.out.println("Passengers are being transported by ship");
    }

    // stop (bir yerde demir atması)
    public void anchor() {
        System.out.println("Ship is anchoring");
    }
}
