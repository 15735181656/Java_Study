package example.ThreadPool;

import java.util.Date;

public class myRun implements Runnable{

    private String command;

    public myRun(String command){
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "   startTime: " + new Date());
        process();
        System.out.println(Thread.currentThread().getName() + "   startTime: " + new Date());
    }

    private void process(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
