package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private List<Observer> observerList;
    private int temprature;

    public ConcreteSubject(){
        this.observerList = new ArrayList<>();
        this.temprature = 0;
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
        notifyObserver();
    }
}
