package com.design.pattern.strategy.withstrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        if(driveStrategy==null){
            throw new IllegalStateException("Strategy not set..");
        }
        this.driveStrategy.drive();
    }
}
