package example.Pattern.AbstractFactoryPattern;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("Color");

        Color color = factory.getColor("Red");

        color.draw();

        Color color2 = factory.getColor("Green");

        color2.draw();
    }
}
