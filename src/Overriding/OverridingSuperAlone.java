/*
 * sub-class may throws no exception
 * 
 * 
 */
package Overriding;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */

class xxx{
    public void set() throws Exception {
        
    }
}

class yyy extends xxx{
    
}

class zzz extends yyy{
    @Override
    public void set(){
        
    }
}

class DDD extends zzz {
    @Override
    public void set(){
        throw new RuntimeException();
    }
}

class EEE extends DDD{
    @Override
    public void set() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EEE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



public class OverridingSuperAlone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     zzz z = new zzz();
     z.set();
     
     
     DDD d = new DDD();
     d.set();
     
    }
    
}
