package com.mrtlptkn.A3_Inheritance;

// extends keyword ile Animal ait özellikleri kabul ediyoruz.


import com.mrtlptkn.A2_Encapsulations.Person;

// Not: javada bir sınıf sadece tek bir sınıftan kalıtım alabilir. Birden fazla sınıftan kalıtım alamaz
// bu sebeple multi inheritance yoktur.

public class Cat extends Animal {

    // sadece kediye özgü bir davranış.
    // kalıtım sayesinde hayvanalara ait ortak özellikleri tekrar tekrar yazmak zorunda kalmadık.
    public void  purr(){
        System.out.println("Cat is purring");
    }


    // Kediler ses çıkarır ve hareket eder fakat bunu yaparken, diğer hayvanlardan farklı yaparlar
    // farklılaşmanın olduğu şeyleri ovveride ederiz.
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving gracefully");
    }



}
