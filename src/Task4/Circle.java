package Task4;

public class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI*(radius*radius);
        System.out.println(area);
        return area;
    }
}
