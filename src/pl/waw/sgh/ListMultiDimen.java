package pl.waw.sgh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMultiDimen {

    public static int totalSum(List<List<Integer>> matrix) {
        int sum = 0;
        for (List<Integer> row : matrix) {
            for (Integer elem : row) {
                sum += elem; // sum = sum + elem
            }
        }
        return sum;
    }

    public static int sumRow(List<List<Integer>> matrix, int rowIndex) {
        int sum = 0;
        List<Integer> row = matrix.get(rowIndex);
        for (Integer elem : row) {
            sum += elem; // sum = sum + elem
        }
        return sum;
    }

    public static int sumColumn(List<List<Integer>> matrix, int colIndex) {
        int sum = 0;
        for (List<Integer> row : matrix) {
            sum += row.get(colIndex);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> myList2d = new ArrayList<>();
        List<Integer> row = Arrays.asList(new Integer[]{46, 25, 466});
        myList2d.add(row);
        myList2d.add(Arrays.asList(new Integer[]{37768, 225, 251}));
        myList2d.add(Arrays.asList(new Integer[]{8935, 62, 324}));

        for (List<Integer> r : myList2d) {
            Integer[] arr = r.toArray(new Integer[0]);
            System.out.println(Arrays.toString(arr));
        }
        // 1. Total sum of all elements
        System.out.println("Total sum: " + totalSum(myList2d));
        // 2. Sum of each row
        System.out.println("Sum row 0: " + sumRow(myList2d, 0));
        // 3. Sum of each column !!!
        System.out.println("Sum col 1: " + sumColumn(myList2d, 1));
    }
}
