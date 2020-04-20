package pl.waw.sgh.obj;

public class Rectangle {
    int parA;
    int parB;

    void setParams(int a, int b) {
        parA = a;
        parB = b;
    }

    int calcSurface() {
        return parA*parB;
    }
}
