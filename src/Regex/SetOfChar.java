/*
 * Character class
 *  using [] to sepecify it match one of a set of char [abc]
 * 
 * 
 */
package Regex;

/**
 *
 * @author YNZ
 */
public class SetOfChar {

    public static void main(String[] args) {
        String regx = "organi[sz]ed"; //match exactly one from s z
        String target = "organised";
        String target1 = "organized";
        System.out.println("Valid? " + target.matches(regx));
        System.out.println("Valid? " + target1.matches(regx));

        String regx1 = "1.2";
        String target2 = "1m2";
        System.out.println("" + target2.matches(regx1));
    }

}
