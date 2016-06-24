/*
 * overloading can decern int and Integer
 * 
 * input is primitive, then it will find the closest slot. 
 */
package Overloading;

/**
 *
 * @author YNZ
 */
public class MethodOverloading {

    void handle(int i) {
        System.out.println("in int");
    }

    void handle(long l) {
        System.out.println("in long");
    }

    void handle(Integer i) {
        System.out.println("in Integer");
    }
    
    void handle(int... a){
        System.out.println("in var argument");
    }

    void handle(Object o) {
        System.out.println("in Object");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.handle(2);
        mo.handle(new Integer(2));
        mo.handle("hello");
        Byte b = 127;
        mo.handle(b);

        byte be = 100;
        mo.handle(be);

        long ll = 1000;
        mo.handle(ll);
        
        float[] f= new float[5];
        mo.handle(f);
        
        int[] i =new int[3];
        mo.handle(i);
    }

}
