package com.example.spotbugs.badpractice;

public class ImplementsCloneButNotCloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
