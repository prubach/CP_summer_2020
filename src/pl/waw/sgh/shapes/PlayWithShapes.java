package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 8);
        System.out.println(r1.calcSurface());

        Rectangle r2 = new Rectangle(3, 4);
        Shape s2 = r2;

        s2.setParams(10, 56);
        double surf = r2.calcSurface();
        System.out.println(surf);

        System.out.println(r2);
        System.out.println(s2.toString());

        //s1.calc
    }

}
