/*
 * FileNotFoundException is a checked exception; it must be 
 * 1) try- catch 2) throws it in the method signature.
 * 
 */
package Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author YNZ
 */



public class FileNotFoundEx {
    
    static void findANullPointer(){
        throw new NullPointerException("dd");
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader(new File("test.txt"));
        findANullPointer();
    }
    
}
