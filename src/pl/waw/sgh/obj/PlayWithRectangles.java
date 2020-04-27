package pl.waw.sgh.obj;

public class PlayWithRectangles {

    public static void calcSth(int in_par) {
        //return;
    }


    public static void main(String[] args) {

        Rectangle.parC = 100;

        int staticSurface = Rectangle.calcSurfaceStatic(10);
        System.out.println(staticSurface);

        //Rectangle r1 = new Rectangle();
        //r1.parA = 14;
        //r1.setParams(4, 4);
        Rectangle r1 = new Rectangle(4, 4);
        //r1.parB

        int surface = r1.calcSurfaceWithParC();
        Rectangle.parC = 100;
        System.out.println("Surface r1: " + surface);
        Rectangle r2 = new Rectangle();
        r2.setParams(3, 6);

       // System.out.println("parA of r2: " + r2.parA);
        System.out.println("Surface r2: " + r2.calcSurfaceWithParC());


    }
}
