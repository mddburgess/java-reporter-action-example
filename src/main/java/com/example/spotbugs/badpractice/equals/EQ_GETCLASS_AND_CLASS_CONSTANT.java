package com.example.spotbugs.badpractice.equals;

public class EQ_GETCLASS_AND_CLASS_CONSTANT {

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (EQ_GETCLASS_AND_CLASS_CONSTANT.class == obj.getClass()) {
            return obj.equals("String");
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
