package com.design.pattern.strategy.withstrategy;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special drive...");
    }
}
