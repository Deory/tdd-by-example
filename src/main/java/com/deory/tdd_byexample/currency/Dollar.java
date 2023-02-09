package com.deory.tdd_byexample.currency;

public class Dollar extends Money {
    
    private String currency = "USD";
    
    Dollar(int amount) {
        this.amount = amount;
    }
    
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
