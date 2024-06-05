package MultiThreading.src;

import java.util.concurrent.*;

class CustonThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setName("Thread1");
        return th;
    }
}

class CustomRejectionPolicy implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString());
    }
}
public class ThreadPool {

    public static void execute(){

        System.out.println("Thread name : " + Thread.currentThread().getName());
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustonThreadFactory(), new CustomRejectionPolicy());
        executor.allowCoreThreadTimeOut(true);
        for(int i=1;i<7;i++){
            executor.submit(()->{
              try{
                  Thread.sleep(500);
                  System.out.println("Task processed by Thread : " + Thread.currentThread().getName());
              } catch (Exception e){
                  System.out.println(e.toString());
              }

            });
        }

        executor.shutdown();
    }
}
