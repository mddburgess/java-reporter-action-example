package com.example.spotbugs.badpractice;

import java.net.URL;

public class UI_INHERITANCE_UNSAFE_GETRESOURCE {

    public URL bug() {
        return getClass().getResource("resource");
    }
}
