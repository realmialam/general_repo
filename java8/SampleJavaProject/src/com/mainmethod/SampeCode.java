package com.mainmethod;

import com.mainmethod.concrete.WhiteBird;
import com.mainmethod.enumpackage.SampleEnum;
import com.mainmethod.interfaces.Bird;
import com.mainmethod.interfaces.Shape;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SampeCode {

	public final int max;

	public SampeCode(int max){
		this.max = max;
	}


	public static void main(String[] args) {
		
		Bird bird = new WhiteBird();
		bird.chirp();
		bird.fly();
		
		
		// Functional interface anonymous class implementation
		
		Shape shape = new Shape() {
			
			@Override
			public void leg() {
				System.out.println("Has many legs..");
				
			}
		};
		
		shape.leg();
		
		
		// Functional interface lambda implementation
		
		Shape shape2 = () -> {
			System.out.println("Using lamda expression..");
		};
		
		shape2.leg();
		
		
		// Types of functional interface
		
		// 1. Consumer
		
		Consumer<Integer> object = (Integer num) -> {
			if(num > 10) {
				System.out.println("Big number in consumer..");
			}
		};
		object.accept(100);
		
		// 2. Supplier
		
		Supplier<String> object2 = () -> {
			String str = "Yes producer functional interface..";
			return str;
		};
		
		System.out.println(object2.get());
		
		// 3. Function
		
		Function<Integer, String> object3 = (Integer val) -> {
			return val.toString() + " hi ther";
		};
		
		System.out.println(object3.apply(100));
		
		
		// Predicate
		
		Predicate<Integer> even = (Integer num) -> {
			if(num%2==0) {
				return true;
			}else {
				return false;
			}
		};
		
		if(even.test(10)) {
			System.out.println("Predicate even number");
		}else {
			System.out.println("Predicate odd number");
		}


		System.out.println("Enum practice..");

		SampleEnum sampleEnum = SampleEnum.valueOf("MONDAY");
		System.out.println("enum value of: " + sampleEnum.name() + " " + sampleEnum.ordinal());

		
		

	}

}
