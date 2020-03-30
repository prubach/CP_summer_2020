package pl.waw.sgh;

import java.util.Arrays;

public class ArrMultiDimen {

    public static void main(String[] args) {
        int[][] myArr2d = new int[2][2];
        myArr2d[0][0] = 54;
        myArr2d[0][1] = 878;
        myArr2d[1][0] = 5345;

//        for (int[] row : myArr2d) {
//            for (int cell : row) {
//                System.out.println(cell);
//            }
//        }
        for (int[] row : myArr2d) {
            System.out.println(Arrays.toString(row));
        }


    }
}
