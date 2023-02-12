package com.deory.tdd_byexample.currency;

public class Bank {
    
    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }
    
}
