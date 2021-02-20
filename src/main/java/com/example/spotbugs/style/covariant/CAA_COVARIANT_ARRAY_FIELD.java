package com.example.spotbugs.style.covariant;

public class CAA_COVARIANT_ARRAY_FIELD {

    private Number[] array;

    public Number bug() {
        array = new Integer[10];
        return array[0];
    }
}
