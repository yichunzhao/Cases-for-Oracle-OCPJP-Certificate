/*
 * Good example! 
 * i++
 * 
 */
package Unary;

/**
 *
 * @author YNZ
 */
public class TestPost {

    public static void doSth(int i) {
        System.out.println(i);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        doSth(i++);
        System.out.println(i);
    }

}
