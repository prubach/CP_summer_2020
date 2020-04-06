package pl.waw.sgh;

import java.io.*;

public class FileBinaryWriter {

    public static void main(String[] args) throws IOException {
        String[] data = new String[] { "My first line", "2nd line; 453653,43"};
        File myFile = new File("test.dat");
        FileOutputStream f = new FileOutputStream(myFile);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(data);
        o.close();
        f.close();
    }
}
