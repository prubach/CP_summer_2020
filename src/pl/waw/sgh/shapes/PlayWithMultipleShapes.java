package pl.waw.sgh.shapes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PlayWithMultipleShapes {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Rectangle(4, 5));
        shapeList.add(new Circle(7));
        shapeList.add(new Rectangle(2, 3));



        for (Shape s : shapeList) {
            //Rectangle ii = (Rectangle)s;
            System.out.println(s);
            System.out.println("Surface: " + s.calcSurface());
            if (s instanceof PerimeterCalculation) {
                // Casting Shape to PerimeterCalculation
                PerimeterCalculation pc = (PerimeterCalculation) s;
                System.out.println("Perimeter: " + pc.calcPerimeter());
            }
        }

    }
}
