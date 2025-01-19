package com.design.pattern.observer;

public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("Observer 1 is notified..");
    }
}
