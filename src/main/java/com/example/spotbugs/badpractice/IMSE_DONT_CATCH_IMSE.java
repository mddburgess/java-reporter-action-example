package com.example.spotbugs.badpractice;

public class IMSE_DONT_CATCH_IMSE {

    public void bug() {
        try {
            Object object = new Object();
            object.notifyAll();
        } catch (IllegalMonitorStateException imse) {
            imse.printStackTrace();
        }
    }
}
