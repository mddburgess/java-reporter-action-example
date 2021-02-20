package com.example.spotbugs.badpractice;

public class FinalizerNullsFields {

    private String answer = "42";

    public String getAnswer() {
        return answer;
    }

    @Override
    protected void finalize() {
        answer = null;
    }
}
