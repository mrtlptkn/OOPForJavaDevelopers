package com.mrtlptkn.A8_Generics;

import com.mrtlptkn.A1_Classes.User;

public class A8_Generic_Sample {

    public static void main(String[] args) {

        // aynı şekilde method isimleri farklı tipte değerler ile çalışmak istersek generic yapıları kullanbiliriz

        // Ne zaman kullanılır ? Farklı tipteki değerler ile aynı işlem akışında çalışmak istediğimiz durumlarda generic yapıları tercih ederiz.

        // Generic sınıfı kullanarak bir örnek oluşturma
        GenericBox<String> stringBox = new GenericBox<>("Hello, Generics!");
        System.out.println(stringBox.getType());

        GenericBox<Integer> integerBox = new GenericBox<>(42);
        System.out.println(integerBox.getType());


        GenericBox<User> userGenericBox = new GenericBox<>(new User("John Doe", "john@test.com"));
        System.out.println(userGenericBox.getType().getFullName() + " - " + userGenericBox.getType().getEmail());
    }
}
