/*
 * File byte IO or character IO
 * File reader or writer for character IO, 
 * 
 */
package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class CharacterIO {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("writer.txt");
        try (BufferedWriter bw = new BufferedWriter(fileWriter)) {
            bw.write("using file writer to write into a file");
            bw.newLine();
            bw.write("starte a new line");
            bw.flush();
        }

        FileReader fr = new FileReader("writer.txt");
        try (BufferedReader fBufferedReader = new BufferedReader(fr)) {
            String c1 = fBufferedReader.readLine();
            String c2 = fBufferedReader.readLine();
            System.out.println(c1);
            System.out.println(c2);
        }

    }

}
