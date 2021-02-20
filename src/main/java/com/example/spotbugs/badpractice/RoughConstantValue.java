package com.example.spotbugs.badpractice;

public class RoughConstantValue {

    public double circumferenceD(double diameter) {
        return diameter * 3.14;
    }

    public double circumferenceR(double radius) {
        return radius * 6.28;
    }
}
