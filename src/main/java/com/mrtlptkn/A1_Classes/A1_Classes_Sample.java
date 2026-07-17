package com.mrtlptkn.A1_Classes;

public class A1_Classes_Sample {

    public static void main(String[] args) {

        // instance alma
        User user = new User("John Doe", "john.doe@test.com");
        User user1 = new User("Jane Doe", "jane.doe@test.com");
        User user2 = new User("Jane Doe", "jane_doe@test.com"); // Bu emailden var o yüzden başka bir öneri sunduk.

        // Örnek Boş consturtor ile üretim
        User user3 = new User();
        user3.setFullName("Jack Doe");
        user3.setEmail("jack.doe@test.com");
        user3.setPassword("123456");

        // user,user1,user2 -> object
        // birbirinden farklı bu objectlerin oluşması için User class kullandık.

        // Soru aynı isme ve maile ait 2 kişiyi birbirinden ne ayırabilir.
        // hashcode nenselerin ram üzerinde aynı özelliklere sahip olsalar dahi dnalarının farklı olduğunu kanıtlamak için kullanılır.
        System.out.println("user1 ->" + user1.hashCode());
        System.out.println("user2 ->" + user2.hashCode());


        // nesne üzerindeki değerleri getter ile okuduk
        System.out.println("user1 ->" + user1.getFullName() + " " + user1.getEmail());
        System.out.println("user2 ->" + user2.getFullName() + " "+ user2.getEmail());

        // setter ile ise nesne üzerindeki değerleri değiştirebiliriz.
        user1.setPassword("123456");
        System.out.println("user1 ->" +  user1.getPassword());

        user2.setPassword("9878432bfn@fdsad");
        System.out.println("user2 ->" +  user2.getPassword());

    }
}
