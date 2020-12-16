package com.example.demo.math;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ImpossibleServiceTest {

    @Autowired
    private ImpossibleService impossibleService;

    @Test
    void divideByZero() {
        var result = impossibleService.divideByZero(1);
        assertThat(result).isEqualTo(1);
    }
}
