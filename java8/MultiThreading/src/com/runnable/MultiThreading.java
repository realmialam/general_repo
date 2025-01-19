package com.runnable;

public class MultiThreading implements Runnable{
    @Override
    public void run() {
        System.out.println("Executing thread: " + Thread.currentThread().getName());
    }
}
