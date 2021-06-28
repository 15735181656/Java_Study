package example.Pattern.FactoryPattern;

import example.Thread.myRunnable;

public class factoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.print();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.print();
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.print();
    }
}
