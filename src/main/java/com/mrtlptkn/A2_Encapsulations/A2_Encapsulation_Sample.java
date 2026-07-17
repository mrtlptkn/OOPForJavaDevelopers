package com.mrtlptkn.A2_Encapsulations;

public class A2_Encapsulation_Sample {

    public static void main(String[] args){

        Person p = new Person();
        p.setFirstName("Ali");
        p.setLastName("Tan");

        // Encapsulation: fieldlara doğru bir şekilde değer girmemizi sağlar. setter ile değer set ederken
        // boş bırakılan hata yapılan değerleri kontrol edebiliriz.

        System.out.println("firstName -> " + p.getFirstName());
        System.out.println("lastName -> " + p.getLastName());



//        p.firstName = "";
//        p.lastName = "";
//
//        System.out.println("firstName -> " + p.firstName);
//        System.out.println("lastName -> " + p.lastName);

    }
}
