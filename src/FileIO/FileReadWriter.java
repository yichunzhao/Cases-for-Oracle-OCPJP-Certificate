/*
 * Java File IO handle Char data type via FileWriter and FileReader
 * 
 * 
 */
package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class FileReadWriter {
    
    public static void main(String[] args) {
        String file = "charfile.txt";
        String content = "中泰高铁将于2017年10月开工建设！等待了这么久，终于要开工建设啦！中国驻曼谷大使馆发表声明称：中国和泰国将于今年9月签署两份协议，启动高铁项目一期工程，将于10月开始施工。这个项目最终是要将中国和新加坡、马来西亚、泰国连接起来，这足够让在新加坡生活的我们兴奋！";
        
        try(FileWriter fw = new FileWriter(file)){
            fw.write(content);
            
        } catch (IOException ex) {
            Logger.getLogger(FileReadWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        char[] cbuf = new char[1024];
        
        try(FileReader fr = new FileReader(file)){
            fr.read(cbuf);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWriter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("" + String.valueOf(cbuf));

        
    }
    
}
