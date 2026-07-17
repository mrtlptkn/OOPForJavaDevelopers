package com.mrtlptkn.A5_Abstraction;

import java.math.BigDecimal;

// Yatırım hesabı üzerinden diğer hesaplardan farklı olarak yatırımda bulunmamız lazım.
// Bir sınıf birden fazla interface implemente ederek işlem yapabilir. Kalıtımdaki gibi tek bir class türeme zorunluluğu yoktur. Birden fazla interface implemente edebiliriz. Investment,FraudDetection iki tane sınıftan özelliklerini yeteneklerini alan bir yapı mevcuttur.
public class InvestmentAccount extends Account implements Investment,FraudDetection {
    @Override
    public void apply(BigDecimal amount) {

        if(isSuspiciousTransaction()) {
           throw new IllegalArgumentException("Suspicious transaction detected. Cannot apply investment.");
        }

        // şüpheli bir işlem yoksa yatırım yapılabilir.

        moneyOut(amount); // yatırım olarak kullanılan para.
        System.out.println("Investment account: Applying " + amount + " to investment account");
    }

    public InvestmentAccount(BigDecimal balance) {
        super(balance);
    }

    @Override
    public void moneyIn(BigDecimal amount) {
        System.out.println("Investment account: Money in: " + amount);
    }

    @Override
    public void moneyOut(BigDecimal amount) {
        System.out.println("Investment account: Money out: " + amount);
    }

    @Override
    public boolean isSuspiciousTransaction() {
        return false;
    }
}
