package example.ThreadPool;

import java.util.concurrent.Callable;

public class myCall implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return Thread.currentThread().getName();
    }
}
