package com.deory.tdd_byexample.currency;

public class Dollar extends Money {
    
    Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
    
}
