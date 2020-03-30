package pl.waw.sgh;

public class StringOperations {

    public static void main(String[] args) {
        String s1 = "2, 3, 5, 7, 11, 13, 17, 19, ";
        System.out.println(s1.lastIndexOf(","));
        System.out.println(s1.length());
        String s2 = s1.substring(0, s1.lastIndexOf(","));
        System.out.println(s2);
        // Tab
        s2 = "\t";
        String[] elems = s1.split(", ");
        // Using for each
        // Thread safe - important for multithreading
        /*for (String s : elems) {
            System.out.println(s);
        }*/
        for (int i=0;i<elems.length;i++) {
            System.out.println(elems[i]);
        }

        System.out.println("2, 3, 5, 7, 11, 13, 17, 19");

    }
}
