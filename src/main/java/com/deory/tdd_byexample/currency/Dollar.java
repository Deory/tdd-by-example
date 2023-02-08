package com.deory.tdd_byexample.currency;

public class Dollar {
    
    int amount;
    
    Dollar(int amount) {
        this.amount = amount;
    }
    
    void times(int multiplier) {
        amount *= multiplier;
    }
    
}
