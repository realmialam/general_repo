package com.design.pattern.factorypattern.factory;

import com.design.pattern.factorypattern.Bike;
import com.design.pattern.factorypattern.Vehicle;

public class BikeFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
