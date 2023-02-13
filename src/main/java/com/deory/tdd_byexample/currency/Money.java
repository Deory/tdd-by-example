package com.deory.tdd_byexample.currency;

import java.util.Objects;

public class Money implements Expression {
    
    protected int amount;
    protected String currency;
    
    String currency() {
        return currency;
    }
    
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, "USD");
    }
    
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
    
    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
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
}
