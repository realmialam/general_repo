package com.design.pattern.factorypattern.factory;

import com.design.pattern.factorypattern.Car;
import com.design.pattern.factorypattern.Vehicle;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
