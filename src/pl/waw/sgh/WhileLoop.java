package pl.waw.sgh;

public class WhileLoop {

    public static void main(String[] args) {
        Integer[] intArr2 = new Integer[5];
        intArr2[0] = 6;
        intArr2[1] = 98;
        intArr2[3] = 56;

        int i = 7;
        while (i < intArr2.length) {
            System.out.println(intArr2[i]);
            i++;
        }

        System.out.println("Do while:");
        int j = 7;
        do {
            System.out.println(intArr2[j]);
            j++;
        } while (j < intArr2.length);

    }
}
