package pl.waw.sgh.shapes;

public class Shape {
    private int parA;
    protected int parB;

//    public Shape() {
//    }

    public Shape(int a, int b) {
        setParams(a, b);
    }

    public void setParams(int parA, int b) {
        System.out.println("Changing parameters parA from: " + this.parA + " to: " + parA);
        this.parA = parA;
        parB = b;
    }
}
