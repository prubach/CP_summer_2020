package pl.waw.sgh.shapes;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        Double sumPar1 = Double.valueOf(o1.parA + o1.parB);
        Double sumPar2 = Double.valueOf(o2.parA + o2.parB);
        int res = sumPar1.compareTo(sumPar2);
        return res;
    }
}
