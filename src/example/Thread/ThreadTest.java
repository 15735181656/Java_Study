package example.Thread;

public class ThreadTest {

    public static void main(String[] args) {
        Runnable runnable = new myRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
