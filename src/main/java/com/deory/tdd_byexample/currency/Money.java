package com.deory.tdd_byexample.currency;

public class Money {
    
    protected int amount;
    protected String currency;
    
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    
    @Override
    public boolean equals(Object object) {
        return object instanceof Money
                && amount == ((Money) object).amount
                && currency.equals(((Money) object).currency);
    }
    
    @Override
    public String toString() {
        return amount + " " + currency;
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
