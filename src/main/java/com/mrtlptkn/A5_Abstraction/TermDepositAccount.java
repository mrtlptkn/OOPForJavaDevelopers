package com.mrtlptkn.A5_Abstraction;

import java.math.BigDecimal;
import java.time.LocalDate;


// yatırım hesabı (hisse senedi, kağıt, borsa vs)
// birikim (altın,gümüş, döviz) küçük birikimler için kullanabiliriz

// vadeli hesap
public class TermDepositAccount extends Account {

    private final LocalDate termDate;

    public TermDepositAccount(BigDecimal balance, LocalDate termDate) {
        super(balance);
        this.termDate = termDate;
    }


    // 90 günlük vade için 90 gün sonunda para girebilir yada çıkabilir.
    // vade tarihinden sonra hem para girişi hemde para çıkışı yapaılabilir.
    // vade dolunca istenilen miktarda para hesaba o gün içinde eklenebilir.
    @Override
    public void moneyIn(BigDecimal amount) {
        if(LocalDate.now().isAfter(termDate)){
            if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0) {
                // BigDecimal immutable oldugu icin sonucu tekrar atamak gerekir.
                balance = balance.add(amount);
            }
        } else {
            throw new IllegalStateException("Term date has not been reached yet. Cannot deposit money.");
        }

    }

    @Override
    public void moneyOut(BigDecimal amount) {
        // eğer para bozma vade tarihi aşıldıysa
        if(LocalDate.now().isAfter(termDate)){
            if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(balance) <= 0) {
                // BigDecimal immutable oldugu icin sonucu tekrar atamak gerekir.
                balance = balance.subtract(amount);
            }
        } else {
            throw new IllegalStateException("Term date has not been reached yet. Cannot withdraw money.");
        }

    }
}
