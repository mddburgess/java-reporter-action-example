package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleTest {

    private static final Logger log = LoggerFactory.getLogger(SimpleTest.class);

    @Test
    void passingTest() {
        log.info("log message");
    }

    @Test
    void failingTestWithMessage() {
        log.info("log message");
        assertThat(2 + 2).isEqualTo(5);
    }

    @Test
    void failingTestWithoutMessage() {
        fail();
    }

    @Test
    void errorTestWithMessage() {
        log.info("log message");
        throw new RuntimeException("error message");
    }

    @Test
    void errorTestWithoutMessage() {
        throw new RuntimeException();
    }

    @Test
    @Disabled
    void disabledTest() {

    }

    @Test
    void skippedTest() {
        assumeThat(1).isNull();
    }
}
