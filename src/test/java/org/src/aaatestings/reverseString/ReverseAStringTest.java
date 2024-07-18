package org.src.aaatestings.reverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {

    @Test
    void reverseAString() {
       String exected = ReverseAString.reverseAString("I am hungry!");
       assertEquals("!yrgnuh ma I", exected);
    }
}