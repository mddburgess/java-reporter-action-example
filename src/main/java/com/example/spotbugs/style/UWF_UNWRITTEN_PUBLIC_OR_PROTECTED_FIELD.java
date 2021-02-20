package com.example.spotbugs.style;

public class UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD {

    public String field;

    public void bug() {
        System.out.println(field);
    }
}
