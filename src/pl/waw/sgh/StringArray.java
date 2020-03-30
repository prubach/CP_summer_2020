package pl.waw.sgh;

import java.util.Arrays;
import java.util.List;

public class StringArray {
    public static void main(String[] args) {
        String[] strArr = new String[] {"ABC","DEF","EFG"};

        for (String s : strArr) {
            System.out.println(s);
        }
        System.out.println(strArr.length);

        System.out.println("Now using a list");

        List<String> myStr2List = Arrays.asList(new String[] {"ABC","DEF","EFG"});

        List<String> myStrList = Arrays.asList(strArr);
        for (String s1 : myStrList) {
            System.out.println(s1);
        }

    }
}
