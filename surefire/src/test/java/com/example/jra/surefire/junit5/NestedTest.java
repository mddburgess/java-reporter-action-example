package com.example.jra.surefire.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedTest {

    private int i;

    @BeforeEach
    void beforeEach() {
        i = 2;
    }

    @Nested
    class NestedSubclass {

        private int j;

        @BeforeEach
        void beforeEach() {
            j = 3;
        }

        @Test
        void test() {
            assertEquals(4, i + j);
        }
    }
}
