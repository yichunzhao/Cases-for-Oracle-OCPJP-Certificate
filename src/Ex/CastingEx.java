/*
 * try to gen. a Class Cast Exception
 * 
 * 
 */
package Ex;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
class Ink {

}

class BlackInk extends Ink{

}

class ColorInk extends Ink implements Printable{
    
}

public class CastingEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ink> al = new ArrayList<>();
        al.add(new BlackInk());
        al.add(new ColorInk());
        
        ColorInk ci = (ColorInk)al.get(0); 
        //from generic type to derived type, it needs a casting: 
        
        Integer[] aa = new Integer[-4];
        
    }

}
