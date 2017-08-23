/*
 * Using FileOutputStream and FileInputStream to read and writebytes to and from file. 
 * Uisng FileWriter and FileReader to read and write char to and from file. 
 * 
 */
package File;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class BufferedStream {

    public static void main(String[] args) throws IOException {
        String content = "Java is verbose!";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("my.txt"))) {
            bos.write(content.getBytes());
            bos.flush();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("my2.txt"))) {
            bw.write("Java has some improvements");
            bw.flush();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("my2.txt"))) {
            bw.write("Java has some improvements");
            bw.flush();
        }

    }
}
