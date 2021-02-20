package com.example.spotbugs.style.covariant;

public class CAA_COVARIANT_ARRAY_LOCAL {

    public Number bug() {
        Number[] array = new Integer[10];
        return array[0];
    }
}
