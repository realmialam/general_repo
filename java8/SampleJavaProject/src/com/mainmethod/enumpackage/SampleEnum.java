package com.mainmethod.enumpackage;

public enum SampleEnum {

    MONDAY("First day"),
    TUESDAY ("Second day"),
    WEDNESDAY ("Third day"),
    THURSDAY ("Four day"),
    FRIDAY ("Five day"),
    SATURDAY ("Six day"),
    SAUNDAY ("seven day");

    private String description;

    SampleEnum(String description){
        this.description = description;
    }

    protected void print(){
        System.out.println("Hi ji enum bhai..");
    }

}
