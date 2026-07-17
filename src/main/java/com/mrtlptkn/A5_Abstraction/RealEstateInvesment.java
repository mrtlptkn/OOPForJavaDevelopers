package com.mrtlptkn.A5_Abstraction;

import java.math.BigDecimal;

public class RealEstateInvesment implements Investment {
    @Override
    public void apply(BigDecimal amount) {
        System.out.println("Real estate investment: Applying " + amount + " to real estate investment");
    }
}
