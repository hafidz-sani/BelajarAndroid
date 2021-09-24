package com.hafidzproject.basicandroid;

public class TestModifier {

    private int number1;



    protected String getProtected(){
        return "Hallo World";
    }

    private String getPrivate(){
        return "Halo halo banding";
    }

    public String getGetPrivate(){
        return this.getPrivate();
    }


}
