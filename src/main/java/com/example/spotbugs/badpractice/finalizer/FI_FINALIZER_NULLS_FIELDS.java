package com.example.spotbugs.badpractice.finalizer;

public class FI_FINALIZER_NULLS_FIELDS {

    private String answer = "42";

    public String getAnswer() {
        return answer;
    }

    @Override
    protected void finalize() {
        answer = null;
    }
}
