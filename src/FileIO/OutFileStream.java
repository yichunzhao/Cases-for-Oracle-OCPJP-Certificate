/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

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
public class OutFileStream {
    public static String copyRight = "// Copyright 2016\n" + "// All rights reserved\n" + "// ********************\n";
    
    public static void main(String[] args) throws FileNotFoundException {
        
        try {
            File file = new File("hello.txt");
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                fileOutputStream.write(copyRight.getBytes());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(OutFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
