package pl.waw.sgh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(35);
        myList.add(76);
        myList.add(3525);
        myList.add(677);

        myList.add(1, 8987);
        myList.set(0, 677);
        //myList.remove(677);
        myList.remove(Integer.valueOf(677));
        myList.remove(Integer.valueOf(677));
        myList.remove(Integer.valueOf(677));
        myList.remove(Integer.valueOf(677));

        System.out.println("Size of my list: " + myList.size());
        System.out.println("elem at idx 2: " + myList.get(2));
        for (Integer el : myList) {
            System.out.println(el);
        }
        int idxOfval = myList.indexOf(Integer.valueOf(76));
        System.out.println("76 is at: " + idxOfval);
        // List -> Array
        Integer[] myArr = myList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(myArr));
        // Array -> List
        List<Integer> mySndList = Arrays.asList(myArr);

    }
}
