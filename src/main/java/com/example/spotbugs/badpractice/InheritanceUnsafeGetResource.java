package com.example.spotbugs.badpractice;

import java.net.URL;

public class InheritanceUnsafeGetResource {

    public URL bug() {
        return getClass().getResource("resource");
    }
}
