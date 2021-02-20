package com.example.spotbugs.badpractice;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class DontAssertInstanceofInTests {

    private Object object = "String";

    public void setInteger() {
        object = 1;
    }

    @org.junit.Test
    public void junit4() {
        Assert.assertTrue(object instanceof String);
    }

    @org.junit.jupiter.api.Test
    public void junit5() {
        Assertions.assertTrue(object instanceof String);
    }
}
