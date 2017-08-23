/*
 * How to load an image and convert it into byte[]
 * 
 * 
 */
package File;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author YNZ
 */
public class Image2Array {

    public static void main(String[] args) {
        byte[] imageArray = null;
        BufferedImage image = null;
        File file = new File("./src/tmp", "hit.jpg");
        try {
            image = ImageIO.read(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
            System.out.println("write to buffer" + ImageIO.write(image, "jpg", baos));
            imageArray = baos.toByteArray();
            System.out.println("size of array " + imageArray.length);

        } catch (IOException ex) {
            Logger.getLogger(Image2Array.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
