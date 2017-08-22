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
        File dirs = new File("./folder/text");
        System.out.println("" + dirs.mkdirs());
        File file = new File(dirs, "ynz.txt");
        System.out.println("" + file.createNewFile());

    }
}
