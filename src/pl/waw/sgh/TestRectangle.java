package pl.waw.sgh;

import pl.waw.sgh.obj.Rectangle;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(4, 5);
        //r1.parA = 4;
        System.out.println(r1.calcSurface());

    }
}
