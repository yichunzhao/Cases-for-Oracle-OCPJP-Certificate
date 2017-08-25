/*
 * DataInputOutputStream and DataOutputStream
 * 
 *  write and read primitive, char to and from a File. 
 */
package FileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class DataInputOutputStream {

    public static void main(String[] args) {
        String name = "mydata.dat";

        try {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(name))) {
                dos.writeInt(20);
                dos.writeChar('k');
                dos.writeFloat(20.1f);
                dos.flush();
            }

            try (DataInputStream dis = new DataInputStream(new FileInputStream(name))) {
                System.out.println("" + dis.readInt());
                System.out.println("" + dis.readChar());
                System.out.println("" + dis.readFloat());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataInputOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
