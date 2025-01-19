package com.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class PracticeShared {

    private Queue<Integer> buffer;
    private int buffersize;

    public PracticeShared(int buffersize){
        this.buffersize = buffersize;
        buffer = new LinkedList<>();
    }


   synchronized public void addItems(int item){
        while(this.buffersize == buffer.size()){
            try {
                System.out.println("Producer is waiting, queue is full..");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        buffer.add(item);
       System.out.println(item + " has been added in buffer..");
        notify();
    }

    synchronized public void consumeItem(){
        while (this.buffer.isEmpty()){
            try {
                System.out.println("Consumer is waiting, queue is empty..");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Integer poll = this.buffer.poll();
        System.out.println(poll + " has been polled out from the queue..");
        notify();
    }
}
