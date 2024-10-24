package Task4;

public class Square implements Shape{
    double lengthAndWidth;

    Square (double lengthAndWidth){
        this.lengthAndWidth = lengthAndWidth;
    }

    @Override
    public double getArea() {
        double area = lengthAndWidth*lengthAndWidth;
        System.out.println(area);
        return area;
    }
}
