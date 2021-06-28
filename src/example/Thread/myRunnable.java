package example.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class myRunnable implements Runnable{

    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try{
            lock.lock();
            for (int i = 0; i < 10; i++)
                System.out.println(Thread.currentThread().getName() + " :: " + i);
        }finally {
            lock.unlock();
        }
    }
}
