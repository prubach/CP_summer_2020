package pl.waw.sgh;

public class Blocks {

    // private, empty - package wide, public
    public static int d = 10;

    public static void main(String[] args) {
        System.out.println(d);
        int a = 5;
        {
            int b = 6;
            System.out.println(a);
            System.out.println(b);
            {
                System.out.println(a);
                System.out.println(b);
            }
        }
        //System.out.println(b);

    }
}
