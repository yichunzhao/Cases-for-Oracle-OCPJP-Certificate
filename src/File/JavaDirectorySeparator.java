/*
 * 
 * mkdirs(), creating folders more than one layer. 
 * 
 */
package File;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class JavaDirectorySeparator {

    public static void main(String[] args) throws IOException {
        String path = File.separator +"var" + File.separator + "temp";
        System.out.println("path "+ path);
        File dirs = new File("./folder/text");
        File dira = new File(path);
        
        System.out.println("What is file path separator " + File.pathSeparator);
        
        
        System.out.println("" + dirs.mkdirs());
        System.out.println("" + dira.mkdirs());
        File file = new File(dirs, "ynz.txt");
        System.out.println("" + file.createNewFile());

    }
}
