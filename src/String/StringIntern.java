/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author YNZ
 */
public class StringIntern {
    final static int aa= Integer.MAX_VALUE;
    final static int a = Integer.MIN_VALUE;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 ="hello world";
        String str2= new String("hello world");
        System.out.println(str1.intern().equals(str2.intern()));
        System.out.println(str2.intern());
        System.out.println(str1.intern());
        
        int a =Integer.MAX_VALUE;
        
        
        System.out.println("a " +a);
        char b = 0;
        b = (char) a;
        System.out.println("b " +b);
        char i = 0;
        System.out.println(i);
        
        int f=0; 
        f =-StringIntern.a;
        System.out.println(StringIntern.a);
        System.out.println(f);
        
        
        
        
        
        
        
    }
    
}
