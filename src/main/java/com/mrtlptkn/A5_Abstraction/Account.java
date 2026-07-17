package com.mrtlptkn.A5_Abstraction;


import java.math.BigDecimal;

// Hesap sınıfı
// para yatırma
// para çekme özellikleri olsun
// para girişi moneyIn
// para çıkışı moneyOut
// para giriş çıkış işlemlerini nasıl yapılacak nakit, kredi kartı mı, bitcoin, hediye kartı
// para girişi eft,havale, swift mi
// abstractionda olay,  soyut moneyIn moneyOut işlemi var ama nasıl yapıacağına dair fikrimiz yok
// asbtract sınıflar instance alınamazlar. soyut sınıftırlar
// abstract sınıflar abstract üyelere sahip olabilir. abstract sınıflar tek amacı kalıtım verebilmektir.
// abstract sınıflardan kalıtım alan sınıflar, abstract methodları implemente etmek uygulamak zorundadır.
public abstract class Account {

    // kalıtım alan her sınıf buna erişim sağlayabilsin.
    // ortak özellik
    protected BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public Account(BigDecimal balance){
        this.balance = balance;
    }


    // para yatırma
    // para yatırma nasıl bir algoritma hiçbir fikrimiz yok ama bu işlemin olması gerektiğini biliyor
    // abstractiondaki amaç yol gösterme
    public abstract void moneyIn(BigDecimal amount);

    // para çekme
    public abstract void moneyOut(BigDecimal amount);


}
