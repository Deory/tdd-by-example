package com.deory.tdd_byexample.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testMoney {
    
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
    
    @Test
    public void testEquals() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    
    @Test
    public void testHashCode() {
        assertEquals(Money.dollar(5).hashCode(), Money.dollar(5).hashCode());
        assertNotEquals(Money.dollar(5).hashCode(), Money.dollar(6).hashCode());
        assertNotEquals(Money.dollar(5).hashCode(), Money.franc(5).hashCode());
        assertNotEquals(Money.franc(5).hashCode(), Money.franc(6).hashCode());
    }
    
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

}
