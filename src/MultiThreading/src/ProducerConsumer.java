package MultiThreading.src;

class Q {
    int num;
    boolean isWait = false;
    public synchronized void set(int num){
        if(isWait) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("Set num : " + this.num);
        this.num = num;
        isWait = true;
        notify();
    }
    public synchronized void get(){
        if(!isWait) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("Get num : " + this.num);
        isWait = false;
        notify();
    }
}

class Producer implements Runnable{
    private  Q q;

    public Producer(Q q){
        this.q = q;
        Thread producerThread = new Thread(this, "Producer");
        producerThread.start();
    }

    public void run(){
        int i=1;
        while(true){
            q.set(i++);
            try{
                Thread.sleep(500);
            } catch (Exception e){

            }
        }
    }
}

class Consumer implements Runnable{
    private  Q q;

    public Consumer(Q q){
        this.q = q;
        Thread consumerThread = new Thread(this, "Consumer");
        consumerThread.start();
    }

    public void run(){
        int i=1;
        while(true){
            q.get();
            try{
                Thread.sleep(1000);
            } catch (Exception e){

            }
        }
    }
}
public class ProducerConsumer {
    public static void execute(){
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

    }
}
