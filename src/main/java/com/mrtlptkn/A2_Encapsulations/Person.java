package com.mrtlptkn.A2_Encapsulations;

public class Person {

    // eğer field private yerine public yazarsak bu durumda
    //
    private String  firstName;
    private String lastName;

    public String getFirstName(){

        return this.firstName;
    }

    public String getLastName() {
        return  this.lastName;
    }

    // Bu sayede yazılımcı hata yapmadan bu değeri düzgün bir şekilde girer sisteme.
    public void setFirstName(String firstName){

        // eğer firstName alanı boş geçerse biz bu alanı kontrol ederiz ve hata verdiririz.
        if(firstName == null || firstName.isEmpty()){
            // uygulamada bir hata meydana getirerek IllegalArgumentException istisna oluşturmak.
            throw new IllegalArgumentException("firstName cannot be null or empty");
        }

        this.firstName = firstName;
    }

    public void setLastName(String lastName){

        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("lastname cannot be null or empty");
        }

        this.lastName = lastName;
    }


}
