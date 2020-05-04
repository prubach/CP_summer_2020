package pl.waw.sgh.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayWithShapesInSet {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Rectangle(4, 5));
        shapeList.add(new Circle(2));
        shapeList.add(new Rectangle(2, 3));

        for (Shape s : shapeList) {
            System.out.println(s);
            System.out.println("Surface: " + s.calcSurface());
        }

        // Use compareTo in Shape to compare based on surface
        //Collections.sort(shapeList);
        // Use ShapeComparator to compare based on sum of parameters
        Collections.sort(shapeList, new ShapeComparator());
        System.out.println("After sorting:");
        for (Shape s : shapeList) {
            System.out.println(s);
            System.out.println("Surface: " + s.calcSurface());
        }

    }
}
