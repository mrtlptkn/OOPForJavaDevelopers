package com.mrtlptkn.A3_Inheritance;

public class Dog extends Animal {

    // sadece köpeğe özgü bir davranış.
    // kalıtım sayesinde hayvanalara ait ortak özellikleri tekrar tekrar yazmak zorunda kalmadık.
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    // kemik yemesi.
    public void eatingBones() {
        System.out.println("Dog is eating bones");
    }



}
