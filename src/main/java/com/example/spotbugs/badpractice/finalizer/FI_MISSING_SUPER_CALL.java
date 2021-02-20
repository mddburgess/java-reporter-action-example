package com.example.spotbugs.badpractice.finalizer;

public class FI_MISSING_SUPER_CALL extends FinalizerSuperclass {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
