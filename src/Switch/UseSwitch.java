/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class UseSwitch {

    public static void main(String... args) {
        int x = 6;
        
        System.out.println( Month.April.name() instanceof String);
        Month.valueOf(Month.April.name());

        switch (x) {
            case 1:
                System.out.println("Bad day");
                break;
            case 2:
                System.out.println("Ok day");
                break;
            case 3:
                System.out.println("Fine day");
                break;
            case 4:
                System.out.println("Good day");
                break;
            case 5:
                System.out.println("Perfect day");
                break;
            default:
                System.out.println(" not here");
                break;
        }
        
        System.out.println(" " + Month.December);

    }
    
    

}
