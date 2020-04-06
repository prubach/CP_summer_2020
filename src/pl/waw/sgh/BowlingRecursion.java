package pl.waw.sgh;

//
public class BowlingRecursion {
    static int bowling(int n) {
        if (n==1) return 1;
        else return bowling(n-1) + n;
    }

    //verification
    public static void main(String[] args) {
        //System.out.println(bowling(5));
        //System.out.println(bowling(3));
        System.out.println(bowling(3468));
    }
}