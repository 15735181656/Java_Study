package example.Pattern.ProductorComsumerPattern;

//通过synchronized关键字来实现
public class Stock {

    boolean products;
    String product;
//    int productInd = 0, consumeInd = 0;

    public synchronized void put(String product){
        while(products){
            try{
                this.wait();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.product = product;
        products = true;
        System.out.println(Thread.currentThread() + "生产: " + this.product);
        notifyAll();
    }

    public synchronized void get(){
        while (!products) {
            try {
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        products = false;
        System.out.println(Thread.currentThread() + "消费: " + this.product);
        notifyAll();
    }
}
