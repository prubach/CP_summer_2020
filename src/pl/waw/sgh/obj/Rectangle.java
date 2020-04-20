package pl.waw.sgh.obj;

public class Rectangle {
    private int parA;
    int parB;

    public Rectangle() {
        System.out.println("Running constructor of Rectangle");
        parA = 2;
        parB = 3;
    }

    public void setParams(int parA, int b) {
        System.out.println("Changing parameters parA from: " + this.parA + " to: " + parA);
        this.parA = parA;
        parB = b;
    }

    public int calcSurface() {
        return parA*parB;
    }
}
