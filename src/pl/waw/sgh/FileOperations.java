package pl.waw.sgh;

import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        String filePath = "src/pl/waw/sgh/";
        //String filePath = ".gitignore";
        //String filePath = "C:/pagefile.sys";
        //String filePath = "C:\\pagefile.sys";
        // "\n"
        // "\t"
        // \\ - "escaped" backslash
        //String filePath = "/c/pagefile.sys";

        File myFile = new File(filePath);
        System.out.println("Exists: " + myFile.exists());
        System.out.println("Is Absolute: " + myFile.isAbsolute());
        System.out.println("Is Directory: " + myFile.isDirectory());
        System.out.println("Is File: " + myFile.isFile());
        System.out.println("Is Hidden: " + myFile.isHidden());
        System.out.println("Length: " + myFile.length());
        System.out.println("Absolute path: " + myFile.getAbsolutePath());
        //myFile.can

        System.out.println("Free space: " + myFile.getFreeSpace());
        System.out.println("Parent: " + myFile.getParentFile().getAbsolutePath());

        //File[] files = myFile.listFiles();
        //File[] files = myFile.listFiles((dir, name) -> name.startsWith("File"));
        File[] files = myFile.listFiles((dir, name) -> new File(dir + "/" + name).length()>1200);

        for (File f : files) {
            System.out.println(f.getCanonicalPath());
            System.out.println("Is Directory: " + f.isDirectory());
            System.out.println("Length: " + f.length());
        }



    }
}
