package com.deory.tdd_byexample.currency;

public interface Expression {
    
    Money reduce(Bank bank, String to);
    
}
