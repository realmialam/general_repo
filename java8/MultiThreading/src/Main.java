import com.extendthread.MyCustomThread;
import com.monitorlock.MonitorLockSample;
import com.producerconsumer.PracticeShared;
import com.producerconsumer.SharedResource;
import com.runnable.MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executing thread: " + Thread.currentThread().getName());
        MultiThreading multiThreading = new MultiThreading();
        Thread thread = new Thread(multiThreading);
        thread.start();
        System.out.println("Executing 2 thread: " + Thread.currentThread().getName());


        MyCustomThread myCustomThread = new MyCustomThread();
        myCustomThread.start();

        MonitorLockSample monitorLockSample = new MonitorLockSample();
        Thread thread1 = new Thread(()->monitorLockSample.task1());
        Thread thread2 = new Thread(() -> monitorLockSample.task2());
        Thread thread3 = new Thread(() -> monitorLockSample.task3());

        thread1.start();
        thread2.start();
        thread3.start();


        System.out.println("PRODUCER CONSUMER PROBLEM..");

        SharedResource sharedResource = new SharedResource(5);
        Thread producer = new Thread(() -> {
            for(int i=0; i<10; i++){
                sharedResource.produceItem(i);
            }
        });
        Thread consumer = new Thread(() -> {
            for(int i=0; i<10; i++){
                sharedResource.consumeItem();
            }
        });

        producer.start();
        consumer.start();


        System.out.println("Practice thread producer consumer problem..");
        PracticeShared practiceShared = new PracticeShared(5);
        Thread thread4 = new Thread(()->{
            for(int i=0; i<9; i++){
                practiceShared.addItems(i+3);
            }
        });

        Thread thread5 = new Thread(()->{
            for (int i=0; i<9; i++){
                practiceShared.consumeItem();
            }
        });

        thread4.start();
        thread5.start();

    }
}