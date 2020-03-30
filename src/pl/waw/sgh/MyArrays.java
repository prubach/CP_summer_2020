package pl.waw.sgh;

import java.util.Arrays;
import java.util.OptionalInt;

public class MyArrays {

    public static void main(String[] args) {
        int[] intArr = new int[5];
        intArr[0] = 6;
        intArr[1] = 98;
        intArr[3] = 56;

        int sumArr = 0;
        for (int i : intArr) {
            sumArr += i;
        }
        System.out.println(sumArr);


        System.out.println(Arrays.toString(intArr));

        Integer[] intArr2 = new Integer[5];
        intArr2[0] = 6;
        intArr2[1] = 98;
        intArr2[3] = 56;

        System.out.println(Arrays.toString(intArr2));

        Integer sumArr2 = 0;
        for (Integer i : intArr2) {
            if (i!=null) sumArr2 += i;
        }
        System.out.println(sumArr2);

/*
        OptionalInt sumArr2Int;
        for (Integer i : intArr2) {
            sumArr2Int += i;
        }
        System.out.println(sumArr2);
*/

    }
}
