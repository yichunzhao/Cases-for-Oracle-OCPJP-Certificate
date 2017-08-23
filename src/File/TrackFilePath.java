/*
 * How the relative path? 
 * 
 * 
 */
package File;

import java.io.File;

/**
 *
 * @author YNZ
 */
public class TrackFilePath {
    
    public static void main(String[] args) {
        File dirs = new File("src/resources/static/tmp");
        
        System.out.println("" + dirs.mkdirs());
        System.out.println("" + dirs.getAbsolutePath());
    }
}
