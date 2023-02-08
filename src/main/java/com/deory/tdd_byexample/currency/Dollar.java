package com.deory.tdd_byexample.currency;

public class Dollar {
    
    int amount;
    
    Dollar(int amount) {
        this.amount = amount;
    }
    
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    
}
