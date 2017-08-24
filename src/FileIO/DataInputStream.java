/*
 * DataInputStream and DataOutputStream
 * 
 *  write and read primitive, char to and from a File. 
 */
package FileIO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class DataInputStream {
    
    public static void main(String[] args) {
        
        try {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("mydata.dat"))) {
                dos.writeInt(20);
                dos.writeChar('k');
                dos.writeFloat(20.1f);
                dos.flush();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException ex){
            Logger.getLogger(DataInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
