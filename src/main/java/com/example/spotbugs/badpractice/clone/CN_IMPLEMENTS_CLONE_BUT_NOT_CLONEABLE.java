package com.example.spotbugs.badpractice.clone;

public class CN_IMPLEMENTS_CLONE_BUT_NOT_CLONEABLE {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
