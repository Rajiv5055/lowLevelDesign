package MultiThreading.src;

import MultiThreading.src.Counter;

public class Multithreading {
    public static void execute() throws Exception {
        Counter counter = new Counter();
//        for(int i=0;i<1000;i++){
//            counter.increment();
//        }
//        System.out.println(counter.getCounter());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join(); // to sync code with threads result;

        System.out.println(counter.getCounter());

    }
}