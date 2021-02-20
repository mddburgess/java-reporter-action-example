package com.example.spotbugs.style.covariant;

public class CAA_COVARIANT_ARRAY_RETURN {

    public Number[] bug() {
        return new Integer[10];
    }
}
