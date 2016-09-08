/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIO;

import java.io.File;
import java.nio.file.Path;

/**
 *
 * @author YNZ
 */
public class UsingPath {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        Path path =  myFile.toPath();
        System.out.println(""+path.toString());
        System.out.println(""+path.getRoot());
        System.out.println(""+path.isAbsolute());
        
                
    }
}
