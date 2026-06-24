package CH17FileHandling;

/*
 * Understanding File Handling in Java
 */

/*
 * File handling in Java allows you to work with files and directories.
 * Java provides several classes for file operations:
 *
 * Main Classes:
 * - File: Represents file and directory pathnames
 * - FileInputStream/FileOutputStream: For reading/writing bytes
 * - FileReader/FileWriter: For reading/writing characters
 * - BufferedReader/BufferedWriter: For efficient reading/writing
 * - Scanner: For reading formatted input
 * - PrintWriter: For formatted output
 * - Files (java.nio.file): Modern approach with utility methods
 *
 * Common Operations:
 * - Creating, reading, writing, deleting files
 * - Checking file properties (exists, readable, writable)
 * - Working with directories
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Java Full stack\\CH01CoreJava\\CH17FileHandling\\txt.txt");
        FileReader fr = new FileReader(f);

        // read one character and stores in character Array
        char[] buf = new char[(int) f.length()];
        fr.read(buf);

        for(char data : buf) {
            System.out.print(data);
        }
        fr.close();
    }

}
