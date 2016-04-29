/*
 * switch(x){  } switch could have a mepty body. 
 * x: byte,char,short,int; and String or Enum
 * Note: x cannot be boolean,long,float,double. 
 * switch(x){case: case: default: case: } this is also valid. 
 * 
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class UseSwitch {

    public static void main(String... args) {
        int x = 6;

        System.out.println(Month.April.name() instanceof String);
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

        byte y = 3;
        switch (y) {
            case 1:
            default://not try-catch-finally; default won't be implemented by default. only on not case matched. 
                System.out.println("no matched!");
                break;
            case 2:
                //System.out.println("case 2");
                break;
        }

    }

}
