/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import CollectionFun.Person;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */


public class ObjectIO {

    public static void main(String[] args) {
        
        Person bd = new Person("Yichun Zhao", 100);

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myobject.obj"))) {
            os.writeObject(bd);
            os.flush();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectIO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
