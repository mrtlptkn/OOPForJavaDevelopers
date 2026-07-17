package com.mrtlptkn.A6_Arrays_And_Collections;

import com.mrtlptkn.A1_Classes.User;

import java.util.*;

public class A6_Arrays_And_Collections_Sample {

    public static void main(String[] args){

        // Diziler
        int[] sayilar = {10,11,12,13,15};
        System.out.println("Dizinin uzunluğu: " + sayilar.length);
        System.out.println("Dizinin ilk elemanı: " + sayilar[0]);
        System.out.println("Dizinin son elemanı: " + sayilar[sayilar.length - 1]);

        Arrays.sort(sayilar);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(sayilar));

        // 2. yöntem
        String[] isimler = new String[5];
        isimler[0] = "jane";
        isimler[1] = "jack";
        isimler[2]="john";
        isimler[3]="jill";
        isimler[4]="jackson";
        // isimler[5]="jakop"; // Index 5 out of bounds

        // Not: Indeksler ile çalışırken kapasiteyi artıramazsınız


        // Not: Koleksiyonlar direkt wrapper typelar ile çalışır. ya class alır yada Integer,String,Long gibi wrapper type alır.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList uzunluğu: " + numbers.size());

        numbers.remove(1); // 1. indexteki elemanı siler
        System.out.println("ArrayList uzunluğu: " + numbers.size());

        int a =  numbers.get(0); // 0. indexteki elemanı getirir
        numbers.set(0, 100); // 0. indexteki elemanı 100 ile değiştirir
        System.out.println("ArrayList ilk elemanı: " + numbers.get(0));

        numbers.sort(null); // null ile sort yaparsak doğal sıralama yapar
        System.out.println("ArrayList sıralanmış hali: " + numbers);
        numbers.sort((java.util.Collections.reverseOrder())); // ters sıralama yapar

        // JAVA 8 sonrası gelen API ile belirli filtreleme işlemleri yapılabilir.
        // diziler bunu desteklemez.
        boolean isExist =  numbers.stream().anyMatch(n -> n > 50); // 50 den büyük bir eleman var mı?
        boolean allElementGratherThanZero = numbers.stream().allMatch(n -> n > 0); // tüm elemanlar 0 dan büyük mü?
       numbers.stream().filter(n -> n > 10).forEach(n -> System.out.println(n)); // 10 dan büyük elemanları yazdırır

       List<Integer> filteredList = numbers.stream().filter(item -> item > 10).toList();

        // ArrayList class ile kullanımımız
        // tablodan verileri çekeriz -> ArrayList içersine doldururuz ve program tarafına bu bilgileri aktarızız.

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("John Doe", "joe.doe@test.com"));
        userList.add(new User("Jane Doe", "jane.doe@test.com"));


        // tüm kolleksiyon içerisindeki itemlarda döneceksek bu şekilde kodlar yazarız.
        // bu yapı koleksiyon içindeki tüm itemları gezer
        for (User user : userList) {
            System.out.println("User Full Name: " + user.getFullName() + ", Email: " + user.getEmail());
        }


        // key value pair kullanırız.
        // K -> Key,V -> Value
        Map<String,String> d = new HashMap<>();
        d.put("hello","greetings");
        d.put("no","usage not allowed");
        d.put("yes","usage allowed");
        d.put("hello","greetings again"); // aynı key değerini tekrar eklersek önceki value silinir ve yeni value eklenir.

        d.get("hello"); // key ile value alırız
        d.remove("no"); // key ile value sileriz
        d.size();
        d.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Map anlatımı
        // Generic Class
        // enum


    }
}
