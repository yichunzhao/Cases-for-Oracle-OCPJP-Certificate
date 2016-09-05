/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.*;

/**
 *
 * @author YNZ
 */
public class FilePath {

    public static void main(String[] args) throws IOException {
        //instantiate a File won't really create a file.
        File myFile = new File("helloworld.txt");
        String path = myFile.getPath();
        System.out.println("" + path);

        //you have to create it. 
        if (!myFile.exists()) {
            System.out.println(myFile.createNewFile());
        }
        FileWriter fw = new FileWriter(myFile);

        fw.write("this is a test file !\n");
        fw.write("how are you!\n");
        fw.write("0");
        int c = 'a';
        fw.write(c);

        fw.close();
        

    }
}
