package pl.waw.sgh;

import java.io.*;
import java.util.Scanner;

public class FileTextWriter {

    public static void main(String[] args) throws IOException {
        String fileName = "test2.txt";
        //String fileName = "/home/pol/dev/CP_summer_2020/test.txt";
        File myFile = new File(fileName);
        FileWriter fw = new FileWriter(myFile);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Our first line of text");
        bw.newLine();
        bw.write("Our 2nd line of text");
        bw.newLine();
        bw.flush();
        bw.write("5252.252");
        //Double d1 = Double.valueOf("5252.252");
        bw.newLine();
        bw.write(69);
        bw.newLine();
        bw.close();
        fw.close();
    }
}
