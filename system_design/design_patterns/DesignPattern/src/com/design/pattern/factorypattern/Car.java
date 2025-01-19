package com.design.pattern.factorypattern;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("car");
    }
}
