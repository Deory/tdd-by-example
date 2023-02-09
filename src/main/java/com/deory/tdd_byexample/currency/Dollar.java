package com.deory.tdd_byexample.currency;

public class Dollar extends Money {
    
    Dollar(int amount) {
        this.amount = amount;
    }
    
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
