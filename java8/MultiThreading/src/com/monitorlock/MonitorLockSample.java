package com.monitorlock;

public class MonitorLockSample {

    synchronized public void task1(){
        System.out.println("Inside task1: " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inside task1 completed: " + Thread.currentThread().getName());
    }

    public void task2(){
        System.out.println("Inside task2: " + Thread.currentThread().getName());
        synchronized (this){
            System.out.println("Inside task2 execution: " + Thread.currentThread().getName());
        }
        System.out.println("Inside task2 completed: " + Thread.currentThread().getName());
    }

    public void task3(){
        System.out.println("Inside task3: " + Thread.currentThread().getName());
        System.out.println("Inside task3 completed: " + Thread.currentThread().getName());
    }
}
