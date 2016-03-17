/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author YNZ
 */
public class Plus2Test {

    static int func1(int i) {
        return i++;//evluate the orginal value.
    }

    static int func2(int i) {
        return ++i;//evluate the new value.
    }

    static int func3(int i) {
        int j = 0;
        j = i++;
        return j;
    }

    static int func4(int i) {
        i++;
        return i;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 10;
        System.out.println(i);
        System.out.println(func1(i));
        System.out.println("i="+i);
        System.out.println(func2(i));
        System.out.println("i="+i);
        System.out.println(func3(i));
        System.out.println("i="+i);
        System.out.println(func4(i));
        System.out.println("i="+i);
    }
}
