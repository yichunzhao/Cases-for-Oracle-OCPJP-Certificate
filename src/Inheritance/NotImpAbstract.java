/*
 * 1) abstract class don't need implement abstract method
 * 2) 'abstract'(modifier) method can only declared in abstract class.
 * 
 */
package Inheritance;

/**
 *
 * @author YNZ
 */

interface A{
    void doSomething();
    void getInfor();
}

abstract class B implements A{
  //abstract class don't need implement abstracted method.
    
}

class C extends B{

    @Override
    public void doSomething() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //abstract void getinfor();

    @Override
    public void getInfor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        

public class NotImpAbstract {
    
}
