package pl.waw.sgh;

import java.io.File;

public class FileOperations {

    public static void main(String[] args) {
        //String filePath = "src/pl/waw/sgh/";
        //String filePath = ".gitignore";
        String filePath = "C:/pagefile.sys";
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

    }
}
