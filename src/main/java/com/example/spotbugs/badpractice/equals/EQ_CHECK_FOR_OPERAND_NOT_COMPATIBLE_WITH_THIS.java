package com.example.spotbugs.badpractice.equals;

public class EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS {

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            return obj.equals("String");
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
