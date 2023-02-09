package com.deory.tdd_byexample.currency;

public class Franc extends Money {
    
    private String currency = "CHF";
    
    Franc(int amount) {
        this.amount = amount;
    }
    
    Money times(int multiplication) {
        return new Franc(amount * multiplication);
    }
    
    String currency() {
        return currency;
    }
}
