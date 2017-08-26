/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class CopyPdfUsingStream {

    public static void main(String[] args) {

        String name = "billet.pdf";
        String copy = "copyBillet.pdf";

        try (
                FileInputStream fis = new FileInputStream(name);
                FileOutputStream fos = new FileOutputStream(copy);) {

            Long t0 = System.currentTimeMillis();
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            Long t1 = System.currentTimeMillis();
            System.out.println("p = " + (t1 - t0));

        } catch (IOException ex) {
            Logger.getLogger(CopyPdfUsingStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
