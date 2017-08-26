/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class BufferedFileInputOutput {

    public static void main(String... vars) throws IOException {
        String name = "billet.pdf";
        String fname = "newBillet.pdf";

        try (
                FileInputStream fis = new FileInputStream(name);
                FileOutputStream fos = new FileOutputStream(fname);
                BufferedInputStream bis = new BufferedInputStream(fis, 1024);
                BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);) {
            Long t0 = System.currentTimeMillis();
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            Long t1 = System.currentTimeMillis();
            System.out.println("p = " + (t1 - t0));
        }
    }

}
