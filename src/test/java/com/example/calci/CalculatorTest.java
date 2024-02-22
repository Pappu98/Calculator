package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        double result = calculator.add(2.5, 3.1);
        assertEquals(5.6, result, 0.001);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(5.0, 2.2);
        assertEquals(2.8, result, 0.001);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(4.0, 3.0);
        assertEquals(12.0, result, 0.001);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10.0, 0.0);
    }
}
