package com.example.demo.math;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
