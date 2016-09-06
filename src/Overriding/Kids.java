/*
 * 
 * Inheritance refers to instannce 
 * 
 */
package Overriding;

/**
 *
 * @author YNZ
 */
class Parents {
    public static final int height = 100;
    
    public static void doSth(){
        System.out.println("in Parents");
    }
    
    public void celebrate(){
        System.out.println("parents celebrate");
    }
   
}

class Kids extends Parents{
    public static final int height = 120;
    
    public static void doSth(){
        System.out.println("in Kids");
    }
    
    @Override
    public void celebrate(){
        System.out.println("kids celebrate");
    }
    
    public static void main(String[] args) {
        Parents.doSth();
        Kids.doSth();
        
        Parents p1 = new Parents();
        Parents p2 = new Kids();
        
        p1.celebrate();
        p2.celebrate();
       
    }
   
}
