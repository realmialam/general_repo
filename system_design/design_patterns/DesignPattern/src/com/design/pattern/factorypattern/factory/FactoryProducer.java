package com.design.pattern.factorypattern.factory;

public class FactoryProducer {
    public static VehicleFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("car")){
            return new CarFactory();
        }else if(factory.equalsIgnoreCase("bike")){
            return new BikeFactory();
        }
        return null;
    }
}
