package example.Pattern.FactoryPattern;

public class ShapeFactory {

    private Shape shape;

    public Shape getShape(String str){
        if (str == null)
            return null;
        if (str.equals("Circle")){
            shape = new Circle();
            return shape;
        }else if(str.equals("Square")){
            shape = new Square();
            return shape;
        }else if(str.equals("Rectangle")){
            shape = new Rectangle();
            return shape;
        }
        return null;
    }
}
