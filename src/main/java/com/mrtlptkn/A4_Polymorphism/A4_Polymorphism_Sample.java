package com.mrtlptkn.A4_Polymorphism;

import com.mrtlptkn.A3_Inheritance.Animal;

public class A4_Polymorphism_Sample {

    public static void main(String[] args) {

        // Bu örneğimizde ise hem inheritance hemde polymorphism söz konusu.

        Taxi taxi = new Taxi();
        taxi.setPassengerCapacity(3);
        taxi.transport();
        taxi.pickUpPassenger();

        Metro metro = new Metro();
        metro.transport();
        metro.setPassengerCapacity(200);
        metro.stop(); // duraklar arası bekleme

        Ship ship = new Ship();
        ship.transport();
        ship.setPassengerCapacity(500);
        ship.anchor(); // demir atma

    }
}
