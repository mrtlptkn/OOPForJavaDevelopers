package com.mrtlptkn.A5_Abstraction;

import java.math.BigDecimal;

// vadesiz hesap
public class CurrentAccount extends Account {
    public CurrentAccount(BigDecimal balance) {
        super(balance);
    }

    @Override
    public void moneyIn(BigDecimal amount) {
        // günlük para giriş limit 30.000
        if (amount != null && amount.compareTo(BigDecimal.valueOf(30000)) <= 0) {
            // BigDecimal immutable oldugu icin sonucu tekrar atamak gerekir.
            balance = balance.add(amount);
        } else {
            throw  new IllegalStateException("Daily deposit limit exceeded. Maximum allowed is 30,000.");
        }
    }

    // para çekileceği zaman çekilecek olan para bakiyemizden küçük olmalıdır
    @Override
    public void moneyOut(BigDecimal amount) {
        if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(balance) <= 0) {
            // BigDecimal immutable oldugu icin sonucu tekrar atamak gerekir.
            balance = balance.subtract(amount);
        } else {
            throw new IllegalStateException("Insufficient balance or invalid amount for withdrawal.");
        }
    }
}


