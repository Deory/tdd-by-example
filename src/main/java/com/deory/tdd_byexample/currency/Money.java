package com.deory.tdd_byexample.currency;

public class Money {
    
    protected int amount;
    protected String currency;
    
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    Money times(int multiplication) {
        return null;
    }
    
    @Override
    public boolean equals(Object object) {
        return getClass().equals(object.getClass())
                && amount == ((Money) object).amount;
                
    }
    
    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    
    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }
    
    String currency() {
        return currency;
    }
    
}
