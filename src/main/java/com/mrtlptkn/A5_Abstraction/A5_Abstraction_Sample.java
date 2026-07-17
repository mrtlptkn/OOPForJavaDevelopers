package com.mrtlptkn.A5_Abstraction;

import java.math.BigDecimal;

public class A5_Abstraction_Sample {

    public  static void main(String[] args){

        // Soyut sınıfların instance alamayız
        // Account account = new Account();

        CurrentAccount ca = new CurrentAccount(BigDecimal.valueOf(10000));
        ca.moneyIn(BigDecimal.valueOf(30000));
        System.out.println("Current Account Balance: " + ca.getBalance());


        ca.moneyOut(BigDecimal.valueOf(5000));
        System.out.println("Current Account Balance after withdrawal: " + ca.getBalance());


        // 30 günlük vade
        // -2 EĞER 2 OLARAK GÜNCELLENİRSE PARA YATIRMAK İÇİN 2 GÜNÜMÜZ VAR HATA ALIRIZ.
        TermDepositAccount ta = new TermDepositAccount(BigDecimal.valueOf(50000), java.time.LocalDate.now().plusDays(-2));
        ta.moneyIn(BigDecimal.valueOf(10000));
        System.out.println("Term Deposit Account Balance: " + ta.getBalance());

        ta.moneyOut(BigDecimal.valueOf(20000));
        System.out.println("Term Deposit Account Balance after withdrawal: " + ta.getBalance());


    }
}
