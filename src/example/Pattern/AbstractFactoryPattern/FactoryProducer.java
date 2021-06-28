package example.Pattern.AbstractFactoryPattern;

import example.Pattern.FactoryPattern.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory){
        if (factory.equals("Color")){
            return new ColorFactory();
        }else if (factory.equals("Shape")){
//            return new ShapeFactory();
            return null;
        }
        return null;
    }
}
