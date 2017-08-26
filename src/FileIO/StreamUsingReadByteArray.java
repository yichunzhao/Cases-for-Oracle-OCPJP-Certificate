/*
 * how to optimise file io read/write an array of byte, instead of 
 * a single byte. 
 * 
 */
package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class StreamUsingReadByteArray {

    public static void main(String[] args) {
        String name = "billet.pdf";
        String newName = "billetNew.pdf";

        try (
                FileInputStream fis = new FileInputStream(name);
                FileOutputStream fos = new FileOutputStream(newName);) {
            Long t0 = System.currentTimeMillis();
            byte[] tmp = new byte[1024];
            while (fis.read(tmp) != -1) {
                fos.write(tmp);
            }
            Long t1 = System.currentTimeMillis();
            System.out.println("p = " + (t1 - t0));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StreamUsingReadByteArray.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StreamUsingReadByteArray.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
