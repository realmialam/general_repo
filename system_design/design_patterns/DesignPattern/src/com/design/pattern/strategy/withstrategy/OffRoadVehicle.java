package com.design.pattern.strategy.withstrategy;


public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
