package com.mrtlptkn.A1_Classes;


// User Ne yapar ?
// Sisteme kayıt olur
// Sistemde oturum açar
// Sistemde oturum kapayabilir
// Oturum açmak için email ve şifre kullanır
// Profil olarak en azından fullname bilgiside gerekir

public class User {

    // field
    private String fullName;
    private String email;
    private String password;

    // constructor
    public User(){

    }

    public User(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    // getters & setters

    // fullName bilgisini dışarıdan class çağırımında okumak için kullanırız
    public String getFullName() {
        return fullName;
    }

    // eğer fullName güncellemek değiştirmek istersek setter kullanırız.
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
