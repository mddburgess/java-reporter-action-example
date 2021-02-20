package com.example.spotbugs.badpractice.finalizer;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

class FinalizerSuperclass {

    private OutputStream os = new ByteArrayOutputStream();

    @Override
    protected void finalize() throws Throwable {
        os.close();
        super.finalize();
    }
}
