/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class OutputStreams {

    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("OutputStream.txt"), true)) {
            char c = 'a';
            for (int i = 0; i < 10; i++) {
                fileOutputStream.write(c++);
            }

        } catch (IOException ex) {
            Logger.getLogger(OutputStreams.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
