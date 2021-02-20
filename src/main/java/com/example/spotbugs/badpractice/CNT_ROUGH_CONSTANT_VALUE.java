package com.example.spotbugs.badpractice;

public class CNT_ROUGH_CONSTANT_VALUE {

    public double circumferenceD(double diameter) {
        return diameter * 3.14;
    }

    public double circumferenceR(double radius) {
        return radius * 6.28;
    }
}
