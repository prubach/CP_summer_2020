package pl.waw.sgh;

//
public class Bowling {
    static int bowling(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //verification
    public static void main(String[] args) {
        System.out.println(bowling(5));
        System.out.println(bowling(3));
        System.out.println(bowling(7));
    }
}