package example.Pattern.AbstractFactoryPattern;

import example.Pattern.FactoryPattern.Shape;

public class ColorFactory extends AbstractFactory{

    private Color color;

    @Override
    public Color getColor(String str){
        if (str == null)
            return null;
        if (str.equals("Red")){
            return new Red();
        }else if(str.equals("Green")){
            return new Green();
        }else if(str.equals("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
