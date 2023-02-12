package com.deory.tdd_byexample.currency;

import java.util.Objects;

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
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
    
    @Override
    public String toString() {
        return amount + " " + currency;
    }
    
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    
    String currency() {
        return currency;
    }
    
}
