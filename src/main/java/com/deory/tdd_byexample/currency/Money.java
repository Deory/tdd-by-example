package com.deory.tdd_byexample.currency;

public abstract class Money {
    
    protected int amount;
    protected String currency;
    
    abstract Money times(int multiplication);
    
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
