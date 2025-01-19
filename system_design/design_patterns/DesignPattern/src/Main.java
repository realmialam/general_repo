import com.design.pattern.chainresponsibility.DebugProcessor;
import com.design.pattern.chainresponsibility.ErrorProcessor;
import com.design.pattern.chainresponsibility.InfoProcessor;
import com.design.pattern.chainresponsibility.LoggingProcessor;
import com.design.pattern.decorator.FarmHouse;
import com.design.pattern.decorator.Pizza;
import com.design.pattern.decorator.VegDelight;
import com.design.pattern.decorator.topping.ExtraCheese;
import com.design.pattern.decorator.topping.Mushroom;
import com.design.pattern.factorypattern.Car;
import com.design.pattern.factorypattern.Vehicle;
import com.design.pattern.factorypattern.factory.FactoryProducer;
import com.design.pattern.factorypattern.factory.VehicleFactory;
import com.design.pattern.observer.ConcreteSubject;
import com.design.pattern.observer.Observer1;
import com.design.pattern.observer.Observer2;
import com.design.pattern.observer.Subject;
import com.design.pattern.strategy.withoutstrategy.OffRoadVehicle;
import com.design.pattern.strategy.withstrategy.PassangerVehicle;

public class Main {
    public static void main(String[] args) {

        // without strategy - same code is repeated in OffRoadVehicle and SportsVehicle

        com.design.pattern.strategy.withoutstrategy.Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();

        // with strategy pattern

        com.design.pattern.strategy.withstrategy.Vehicle vehicle1 = new com.design.pattern.strategy.withstrategy.OffRoadVehicle();
        vehicle1.drive();

        com.design.pattern.strategy.withstrategy.Vehicle vehicle2 = new PassangerVehicle();
        vehicle2.drive();


        // Observer pattern

        ConcreteSubject subject = new ConcreteSubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.setTemprature(97);






       // decorator pattern

        Pizza pizza = new VegDelight();
        System.out.println(pizza.cost());

        Pizza pizza1 = new ExtraCheese(new VegDelight());
        System.out.println(pizza1.cost());

        Pizza pizza2 = new ExtraCheese(new Mushroom(new FarmHouse()));
        System.out.println(pizza2.cost());


        // abstract factory pattern
        VehicleFactory carFactory = FactoryProducer.getFactory("car");
        Vehicle car1 = carFactory.createVehicle();
        car1.drive();

        VehicleFactory bikeFactory = FactoryProducer.getFactory("bike");
        Vehicle bike1 = bikeFactory.createVehicle();
        bike1.drive();


        // chain responsibility design pattern
        LoggingProcessor logger = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));
        logger.log(3, "null pointer exception");
        logger.log(1, "just for info");
        logger.log(2, "debugger message");



    }
}