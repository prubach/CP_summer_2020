package pl.waw.sgh.obj;

public class PlayWithRectangles {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(4, 5);
        int surface = r1.calcSurface();
        System.out.println("Surface r1: " + surface);
        Rectangle r2 = new Rectangle();
        r2.setParams(3, 6);

        System.out.println("parA of r2: " + r2.parA);
        System.out.println("Surface r2: " + r2.calcSurface());

    }
}
