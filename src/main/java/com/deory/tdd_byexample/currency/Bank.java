package com.deory.tdd_byexample.currency;

public class Bank {
    
    Money reduce(Expression source, String to) {
        if (source instanceof Money) {
            return (Money) source;
        }
        else {
            Sum sum = (Sum) source;
            return sum.reduce(to);
        }
    }
    
}
