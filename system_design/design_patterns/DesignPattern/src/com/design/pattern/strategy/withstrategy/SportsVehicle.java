package com.design.pattern.strategy.withstrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SpecialDrive());
    }
}
