package com.example.spotbugs.style;

public class UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR {

    public String field;

    public void setField(String field) {
        this.field = field;
    }

    public void bug() {
        System.out.println(field.length());
    }
}
