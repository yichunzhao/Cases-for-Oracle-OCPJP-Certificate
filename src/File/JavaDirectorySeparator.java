/*
 * 
 * 
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
        File dir = new File("./folder");
        System.out.println("" + dir.mkdir());
        File file = new File(dir, "ynz.txt");
        System.out.println("" + file.createNewFile());

    }
}
