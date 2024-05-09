package MultiThreading.src;

public class Counter {
    private int counter;

    public synchronized void increment(){
        this.counter ++;
    }
    public int getCounter(){
        return this.counter;
    }
}
