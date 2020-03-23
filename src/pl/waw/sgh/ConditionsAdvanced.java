package pl.waw.sgh;

import java.util.HashMap;
import java.util.Map;

public class ConditionsAdvanced {

    public static void main(String[] args) {
        int a = 5;
        // newval = condition ? value when true : value when false
        String astr = a > 3 ? "A greater than 3" : "A is not greater than 3";
        System.out.println(astr);

        String myVar = "R";

        switch (myVar) {
            case "A":
                System.out.println("var is A");
            case "B":
                System.out.println("var is B");
                break;
            default:
                System.out.println("var is default...");
        }

        Map<String, String> myMap = new HashMap<>();
        myMap.put("A", "v is A");
        myMap.put("B", "v is B");
        myMap.put("C", "v is C");

        String res = myMap.get(myVar);
        System.out.println("Result: " + res);



    }
}
