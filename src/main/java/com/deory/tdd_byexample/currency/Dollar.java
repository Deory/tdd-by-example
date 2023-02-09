package com.deory.tdd_byexample.currency;

public class Dollar extends Money {
    
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
    
}
