package com.example.jra.surefire.junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeforeAllExceptionTest {

    private static Integer i;

    @BeforeAll
    static void beforeAll() {
        i = 42 / 0;
    }

    @Test
    void add() {
        assertEquals(43, i + 1);
    }

    @Test
    void subtract() {
        assertEquals(41, i - 1);
    }

    @Test
    void multiply() {
        assertEquals(84, i * 2);
    }

    @Test
    void divide() {
        assertEquals(21, i / 2);
    }
}
