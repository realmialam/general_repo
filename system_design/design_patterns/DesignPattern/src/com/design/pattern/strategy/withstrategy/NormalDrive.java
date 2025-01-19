package com.design.pattern.strategy.withstrategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive...");
    }
}
