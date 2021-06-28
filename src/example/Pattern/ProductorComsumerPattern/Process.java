package example.Pattern.ProductorComsumerPattern;

public class Process {

    public static void main(String[] args) {

        Stock stock = new Stock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    stock.put("dell");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    stock.put("lenovo");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    stock.get();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
