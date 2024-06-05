package MultiThreading.src;

import MultiThreading.src.Counter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 two ways of initializing thread
 1) by extending thread
 2) by implementing runnable
 */

class MyRunnable1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i++<1000){
            System.out.println("Thread 1 is processing");
        }
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i++<1000){
            System.out.println("Thread 2 is processing");
        }
    }
}


public class Multithreading {
    public static void execute() throws Exception {
//        Counter counter = new Counter();
////        for(int i=0;i<1000;i++){
////            counter.increment();
////        }
////        System.out.println(counter.getCounter());
//
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.increment();
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    counter.increment();
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join(); // to sync code with threads result;

//        System.out.println(counter.getCounter());
        MyRunnable1 t1 = new MyRunnable1();
        t1.setPriority(1);
        t1.start();
        t1.run();
        MyRunnable2 r2 = new MyRunnable2();
        Thread t2 = new Thread(r2);
        // it is used to add wait time in code
        Thread.sleep(1000);
        // to set priority
        t2.setPriority(Thread.MAX_PRIORITY);
        // wait until t1 executed completely
        t1.join();

        ArrayList<Integer> a = new ArrayList<>();
        t2.start();

        ArrayDeque<Integer> aad = new ArrayDeque<>();
    }
}