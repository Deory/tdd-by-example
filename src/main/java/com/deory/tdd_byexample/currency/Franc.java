package com.deory.tdd_byexample.currency;

public class Franc {
    
    private int amount;
    
    Franc(int amount) {
        this.amount = amount;
    }
    
    Franc times(int multiplication) {
        return new Franc(amount * multiplication);
    }
    
    @Override
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
    
}
