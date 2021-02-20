package com.example.spotbugs.style;

public class URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD {

    public String publicField;
    protected String protectedField;

    public void setFields() {
        publicField = "public";
        protectedField = "protected";
    }
}
