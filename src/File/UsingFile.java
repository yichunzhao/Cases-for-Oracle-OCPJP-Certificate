/*
 * Using to create a dir
 * 
 * 
 */
package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class UsingFile {

    public static void main(String... vars) throws IOException {
        File dir = new File("./images");
        if (!dir.exists()) {
            System.out.println("dir created ? " + dir.mkdir());
        }
        
        File file = new File(dir, "ynz.txt");
        System.out.println("file created ? " + file.createNewFile());
        
        FileWriter fw = new FileWriter(file);
        fw.write("wow ha ha ...");
        fw.close();
        
        System.out.println("path : " + file.getPath());
        System.out.println("path : " + file.getAbsolutePath());
        
        
    }
}
