package com.example.spotbugs.badpractice;

public class DontCatchImse {

    public void bug() {
        try {
            Object object = new Object();
            object.notifyAll();
        } catch (IllegalMonitorStateException imse) {
            imse.printStackTrace();
        }
    }
}
