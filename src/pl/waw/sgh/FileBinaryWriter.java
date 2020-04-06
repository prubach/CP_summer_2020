package pl.waw.sgh;

import java.io.*;

public class FileBinaryWriter {

    public static void main(String[] args) throws IOException {
        String[] data = new String[] { "My first line", "2nd line; 453653,43"};
        Double d1 = 586269346.245;
        //5.86269346 245E8
        File myFile = new File("test.dat");
        FileOutputStream f = new FileOutputStream(myFile);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(data);
        //o.writeObject(d1);
        o.writeDouble(d1);
        o.close();
        f.close();
    }
}
