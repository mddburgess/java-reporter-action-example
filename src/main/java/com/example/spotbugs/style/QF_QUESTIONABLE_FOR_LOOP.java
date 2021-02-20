package com.example.spotbugs.style;

public class QF_QUESTIONABLE_FOR_LOOP {

    public void bug() {
        int y = 0;
        for (int x = 0; x < 10; y++) {
            System.out.println(x++);
        }
    }
}
