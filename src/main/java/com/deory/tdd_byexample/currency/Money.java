package com.deory.tdd_byexample.currency;

public abstract class Money {
    
    protected int amount;
    
    abstract Money times(int multiplication);
    
    @Override
    public boolean equals(Object object) {
        return getClass().equals(object.getClass())
                && amount == ((Money) object).amount;
                
    }
    
}
