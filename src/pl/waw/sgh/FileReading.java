package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "test.txt";
        //String fileName = "/home/pol/dev/CP_summer_2020/test.txt";
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);

        File myFile = new File(fileName);
        Scanner scanner = new Scanner(myFile);
        int i = 0;
        while (scanner.hasNextLine()) {
            String myLine = scanner.nextLine();
            i++;
            System.out.println("Line " + i + " : " + myLine);
        }
    }
}
