/*
 * try - catch 
 * try - finally
   try -catch -finally 
   not flex as switch default
 * how about try- finally - catch; negative. 
 */
package Ex;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;

/**
 *
 * @author YNZ
 */
public class TryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader(new File("test.txt"));

        } catch (IOException ex) {
            Logger.getLogger(TryCatchFinally.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

}
