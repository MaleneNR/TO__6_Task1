package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();

   void addShape(Shape s){
       shapes.add(s);
   }

   double getTotalArea(){
        double area = 0;
        for (Shape s : shapes){
            area += s.getArea();
        }
       System.out.println(area);
        return area;
   }

}
