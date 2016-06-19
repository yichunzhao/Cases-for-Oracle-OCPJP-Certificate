/*
 * not only primitive and object arrays, but also interface and abstract
 * class arrays
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */

interface myInterface{
    void doSth();
}

class myDevice extends myAbstract implements myInterface{

    @Override
    public void doSth() {
        System.out.println("my device do something!");
    }
}

abstract class myAbstract{
    abstract public void doSth();
}

public class InterfaceArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       myInterface[] is = new myInterface[3];
       is[0] = new myDevice();
       is[1] = new myDevice();
       is[2] = new myDevice();
       
       List[] ls = new List[4];
       ls[1] = new ArrayList();
       ls[4] = new ArrayList();
       
       myAbstract[] as = new myAbstract[2];
       as[0] = new myDevice();
       as[1] = new myDevice();
    }
    
}
