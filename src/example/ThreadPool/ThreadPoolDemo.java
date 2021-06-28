package example.ThreadPool;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
        ThreadPoolExecutor executor  = new ThreadPoolExecutor(CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        ArrayList<Future<String>> futureArrayList = new ArrayList<>();
        Callable<String> callable = new myCall();

        for (int i = 0; i < 10; i++){
//            Runnable work = new myRun("" + i);
//            executor.execute(work);
            Future<String> future = executor.submit(callable);
            futureArrayList.add(future);
        }

        for (Future<String> f : futureArrayList){
            try{
                System.out.println(new Date() + " :: " + f.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        executor.shutdown();
//        while (!executor.isTerminated()){
//
//        }
        System.out.println("finish all threads");
    }
}
