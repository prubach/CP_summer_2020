package pl.waw.sgh.shapes;

public class Rectangle extends Shape implements PerimeterCalculation {
    // Constructors are not inherited!!!
    // If parent doesn't have a default constructor (no parameters) then no default constructor here
    public Rectangle(double a, double b) {
        super(a, b);
        //parB = b;
    }

    public double calcSurface() {
        return this.parA*parB;
    }

    @Override
    public double calcPerimeter() {
        return 2*parA + 2*parB;
    }
}
