/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class OutputBufferedFileStream {

    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("./src/tmp");
        dir.mkdirs();
        File file = new File(dir, "ynz.txt");
        FileOutputStream os = new FileOutputStream(file);
        try(BufferedOutputStream bos = new BufferedOutputStream(os)){
            bos.close();
        } catch (IOException ex) { 
            Logger.getLogger(OutputBufferedFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
