package com.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    public Queue<Integer> buffer;
    public int bufferSize;

    public SharedResource(int bufferSize){
        buffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    synchronized public void produceItem(int item){
        while(this.buffer.size()==bufferSize){
            try {
                System.out.println("Buffer is full, so thread is waiting: " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        buffer.add(item);
        System.out.println(item + " is added into the buffer.. by thread: " + Thread.currentThread().getName());
        notify();
    }

    synchronized public void consumeItem(){
        while(this.buffer.isEmpty()){
            try {
                System.out.println("Since buffer is empty, so thread is waiting to consume: " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        this.buffer.remove();
        notify();
        System.out.println("Item is consumed by the thread: " + Thread.currentThread().getName());
    }
}
