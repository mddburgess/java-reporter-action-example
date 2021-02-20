package com.example.spotbugs.badpractice.finalizer;

public class FI_USELESS {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
