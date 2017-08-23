/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class UsingIOStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String talk = " I have something to speak out. ";
        FileOutputStream fos = new FileOutputStream("./src/tmp/hello.txt");
        try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(talk.getBytes());
            bos.flush();
        }
        
    }
}
