package pl.waw.sgh.shapes;

public class Rectangle extends Shape {
    // Constructors are not inherited!!!
    // If parent doesn't have a default constructor (no parameters) then no default constructor here
    public Rectangle(double a, double b) {
        super(a, b);
        //parB = b;
    }

    public double calcSurface() {
        return this.parA*parB;
    }
}
