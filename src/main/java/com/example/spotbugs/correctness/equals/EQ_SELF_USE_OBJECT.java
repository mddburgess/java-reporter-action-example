package com.example.spotbugs.correctness.equals;

public class EQ_SELF_USE_OBJECT {

    public boolean equals(EQ_SELF_USE_OBJECT obj) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
