/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class InFileStream {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
            int i = fileInputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fileInputStream.read();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(InFileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
