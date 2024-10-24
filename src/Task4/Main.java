package Task4;

public class Main {
    public static void main (String[] args){
        Shape circle = new Circle(3.5);
        Shape square = new Square(3.5);


        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        shapeBuilder.getTotalArea();

    }
}
