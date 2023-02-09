package com.deory.tdd_byexample.currency;

public abstract class Money {
    
    protected int amount;
    
    abstract Money times(int multiplication);
    
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
    
}
