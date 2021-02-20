package com.example.spotbugs.badpractice.finalizer;

public class FI_EXPLICIT_INVOCATION {

    public void bug() throws Throwable {
        finalize();
    }
}
