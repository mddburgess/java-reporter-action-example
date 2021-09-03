package com.example.jra.surefire;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5Test {

    @Test
    void passingTest() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void failingTest() {
        assertEquals(5, 2 + 2);
    }

    @Test
    void erroredTest() {
        assertEquals(4, 2 / 0);
    }

    @Test
    @Disabled
    void skippedTest() {
        assertEquals(4, 2 + 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void parameterizedTest(int number) {
        assertEquals(0, number % 2);
    }
}
