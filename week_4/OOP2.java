package week_4;

import week_4.objective2.Rectangle;
import week_4.objective2.Shape;
import week_4.objective2.Triangle;

public class OOP2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 5);
        shapes[1] = new Triangle(5, 5);

        viewDetails(shapes);

    }
    public static void viewDetails(Shape[] Shapes){
        for (Shape shape : Shapes){
            System.out.println(shape.toString());
        }
    }
}


