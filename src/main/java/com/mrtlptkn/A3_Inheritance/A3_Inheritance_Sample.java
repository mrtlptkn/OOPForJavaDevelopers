package com.mrtlptkn.A3_Inheritance;

public class A3_Inheritance_Sample {

    public  static void main(String[] args){

        // Animal class'ından türetilmiş Dog ve Cat class'larını kullanıyoruz.
        Dog dog = new Dog();
        dog.eat(); // Animal class'ından miras alınan method
        dog.sleep(); // Animal class'ından miras alınan method
        dog.makeSound(); // Dog class'ında override edilen method
        dog.move(); // Dog class'ında override edilen method
        dog.eatingBones(); // Dog class'ına özgü method

        System.out.println("------------");

        Cat cat = new Cat();
        cat.eat(); // Animal class'ından miras alınan method
        cat.sleep(); // Animal class'ından miras alınan method
        cat.makeSound(); // Cat class'ında override edilen method
        cat.move(); // Cat class'ında override edilen method
        cat.purr(); // Cat class'ına özgü method

    }
}
