package example;

public class PloyB extends PloyA{

    public int id;

    @Override
    public void ploy() {
        System.out.println("this is PloyB!");
    }

    public void ploy2(){
        System.out.println("this is only in PloyB!");
    }
}
