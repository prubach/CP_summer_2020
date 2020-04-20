package pl.waw.sgh.obj;

public class Rectangle {
    private int parA;
    int parB;

    static int parC = 8;

    public Rectangle() {
        System.out.println("Running constructor of Rectangle");
        parA = 2;
        parB = 3;
    }

    public Rectangle(int a, int b) {
        setParams(a, b);
    }

    public void setParams(int parA, int b) {
        System.out.println("Changing parameters parA from: " + this.parA + " to: " + parA);
        this.parA = parA;
        parB = b;
    }

    public int calcSurface() {
        return parA*parB;
    }

    public int calcSurfaceWithParC() {
        return parA*parB + parC;
    }

    public static int calcSurfaceStatic(int staticParA) {
        return parC * staticParA;
    }
}
