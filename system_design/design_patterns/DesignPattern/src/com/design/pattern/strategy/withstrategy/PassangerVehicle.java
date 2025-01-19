package com.design.pattern.strategy.withstrategy;


public class PassangerVehicle extends Vehicle {
    public PassangerVehicle() {
        super(new NormalDrive());
    }
}
