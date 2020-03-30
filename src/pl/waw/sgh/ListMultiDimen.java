package pl.waw.sgh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMultiDimen {
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
        // 2. Sum of each row
        // 3. Sum of each column !!!

    }
}
