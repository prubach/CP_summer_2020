package pl.waw.sgh;

import java.io.*;
import java.util.Arrays;

public class FileBinaryReader {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File myFile = new File("test.dat");

        FileInputStream f = new FileInputStream(myFile);
        ObjectInputStream o = new ObjectInputStream(f);
        String[] data = (String[])o.readObject();
        //Double d1 = (Double)o.readObject();
        Double d1 = o.readDouble();
        o.close();
        f.close();
        System.out.println(Arrays.toString(data));
        System.out.println("Got double: " + d1);
    }
}
