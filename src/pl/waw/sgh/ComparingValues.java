package pl.waw.sgh;

public class ComparingValues {

    public static void main(String[] args) {
        int a = 8;
        int b = 8;

        if (a==b) {
            System.out.println("a equal b");
        }

        Integer aa = 8;
        Integer bb = 8;

        if (aa==bb) {
            System.out.println("aa equal bb");
        }

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1);
        System.out.println(s2);

        if (s1==s2) {
            System.out.println("s1 equal s2");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 equal s2");
        }
    }
}
