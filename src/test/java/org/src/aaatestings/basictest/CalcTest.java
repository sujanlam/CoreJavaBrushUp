package org.src.aaatestings.basictest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void divide() {
        Calc calc = new Calc();
        int expected = 2;
        int actual = calc.divide(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        Calc calc = new Calc();
        int expected = 500;
        int actual = calc.multiply(10, 50);
        assertEquals(expected, actual);
    }
}
