package com.mrtlptkn.A4_Polymorphism;


// Taşıt denilen sınıf -> kara taşıtı, hava taşıtı veya deniz taşıtı, demiryolları taşıtı olabilir.
// Bir yerden bir yere yolcu taşıyan herşey taşıttır
// bir yolcu kapasitesi olmalı
// bir yerden bir yere gitmek (transport)
// taşıma şekiller farklılaşabilir (taksi ile yolcu taşıma, uçak ile yolcu taşıma, gemi ile yolcu taşıma)
public class Vehicle {

    private int passengerCapacity;

    public int getPassengerCapacity(){
        return  this.passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity){

        if(passengerCapacity < 1){
            throw new IllegalArgumentException("Passenger capacity must be at least 1");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public void transport() {
        System.out.println("Vehicle is transporting passengers");
    }
}
