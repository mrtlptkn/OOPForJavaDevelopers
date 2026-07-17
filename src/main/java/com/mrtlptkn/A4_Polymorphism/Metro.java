package com.mrtlptkn.A4_Polymorphism;

public class Metro  extends Vehicle {

    @Override
    public void transport() {
        System.out.println("Passengers are being transported by metro");
    }

    // stop (bir yerde durması)
    public void stop() {
        System.out.println("Metro is stopping at the station");
    }
}
