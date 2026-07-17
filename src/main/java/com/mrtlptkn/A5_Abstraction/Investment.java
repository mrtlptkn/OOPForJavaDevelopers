package com.mrtlptkn.A5_Abstraction;

import java.math.BigDecimal;

// Interfacede abstract sınıflar soyuttur. Tek başına kullanıldığında bir anlam ifade etmez.
public interface Investment {
    // şu kadar miktar parayı yatırım için kullanacağız
    void apply(BigDecimal amount);
}


// InvestmentAccount üzerindende yatırım yapılabilir
// Bir ev alarak da bir yatırım yapılabilir
// Bir ticari iş ortaklığı yaparak da yatırım yapılabilir.

// Interface sayesinde kalıtımın daha üstünde bir işlem yaparız.
// Sadece tek bir atadan türeyen sınıflara özellik kazandırmayız
// Farkı sınıflarıda tek bir yatırım çatısı altında toplarız.

// CommercialPartneship implements Investment
// InvestmentAccount implements Investment
// RealEstateInvestment implements Investment