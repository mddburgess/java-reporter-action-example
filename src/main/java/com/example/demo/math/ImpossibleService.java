package com.example.demo.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpossibleService {

    @Autowired
    private MathService mathService;

    public int divideByZero(int number) {
        return mathService.divide(number, 0);
    }
}
