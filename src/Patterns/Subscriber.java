/*
 * Observer pattern: observer are registered by the observable. 
 * 
 * and open the template in the editor.
 */
package Patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author YNZ
 */
public class Subscriber implements Observer{
    
    private Map datamap = new HashMap();
    
    

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
