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
public class StrSub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
     //   System.out.println("sub str 2,5 = " + b2.substring(2, 5));
     //   System.out.println(b2.insert(3, b1.append("a")));
     //   System.out.println(b1);
        
        System.out.println("b2 " +  b2);
        System.out.println("b2.substring(4)" +b2.substring(4));
        System.out.println(b1.replace(3, 4, b2.substring(4)));
        
        

    }

}
