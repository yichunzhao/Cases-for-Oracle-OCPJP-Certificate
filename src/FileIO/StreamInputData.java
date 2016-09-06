/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class StreamInputData {

    public static void main(String[] args) {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream("helloworld.txt"));

            try {
                char c = 0;
                while ((c = dataInputStream.readChar()) != -1) {
                    System.out.println(c);

                }
            } catch (IOException ex) {
                Logger.getLogger(StreamInputData.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            try {
                dataInputStream.close();
                Logger.getLogger(StreamInputData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex1) {
                Logger.getLogger(StreamInputData.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

}
