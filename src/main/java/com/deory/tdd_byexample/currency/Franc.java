package com.deory.tdd_byexample.currency;

public class Franc extends Money {
    
    Franc(int amount) {
        this.amount = amount;
    }
    
    Franc times(int multiplication) {
        return new Franc(amount * multiplication);
    }
    
}
