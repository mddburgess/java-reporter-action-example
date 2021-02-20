package com.example.spotbugs.correctness;

public class UWF_NULL_FIELD {

    public String field = null;

    public void bug() {
        System.out.println(field);
    }
}
