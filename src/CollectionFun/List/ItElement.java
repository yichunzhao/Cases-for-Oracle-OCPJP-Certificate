/*
 * using iterator traerse elements of collection 
 * it.remove must impl. after it.next; otherwise, illigal state exception. 
 */

package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author YNZ
 */
public class ItElement {

    /**
     *
     */
    public static final int LIST_SIZE = 20;

    Random r = new Random();
    private List<Double> list;
    
    //instance fields init. block.
    {
        list = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(r.nextDouble());
        }
    }
   
     //jvm will put a default non-arugment constructor here
     // the init. block will be copied inside it. 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItElement element = new ItElement();
        System.out.println("list size " + element.list.size());
        
        Iterator<Double> it = element.list.iterator();
        while(it.hasNext()){
            //System.out.println(""+it.next());
            it.next();
            it.remove();
        }
        System.out.println("list size " + element.list.size());
    }
}
