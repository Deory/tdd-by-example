package com.deory.tdd_byexample.currency;

public class Franc extends Money {
    
    Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    Money times(int multiplication) {
        return new Franc(amount * multiplication, null);
    }
    
}
