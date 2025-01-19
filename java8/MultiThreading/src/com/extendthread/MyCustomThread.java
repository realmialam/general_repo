package com.extendthread;

import java.util.concurrent.ThreadPoolExecutor;

public class MyCustomThread extends Thread{

    @Override
    public void run(){
        System.out.println("Executing thread: " + Thread.currentThread().getName());
    }
}
