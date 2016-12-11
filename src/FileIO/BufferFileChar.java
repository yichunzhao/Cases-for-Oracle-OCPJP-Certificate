/*
 * BufferedWriter is 
 * 
 * 
 */
package FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class BufferFileChar {
    
    public static void main(String[] args) throws IOException {
        File file = new File("myFile.txt");
        FileWriter fileWriter = new FileWriter(file);
        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("what I need to write");
            bufferedWriter.newLine();
            bufferedWriter.write("I have nothing to say");
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        
    }
    
}
