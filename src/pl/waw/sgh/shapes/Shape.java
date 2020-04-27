package pl.waw.sgh.shapes;

public abstract class Shape {
    protected double parA;
    protected double parB;

//    public Shape() {
//    }

    public Shape(double a, double b) {
        setParams(a, b);
    }

    public void setParams(double parA, double b) {
        System.out.println("Changing parameters parA from: " + this.parA + " to: " + parA);
        this.parA = parA;
        parB = b;
    }
}
