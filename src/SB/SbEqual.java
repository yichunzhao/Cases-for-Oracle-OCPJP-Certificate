/*
 * Does string builder overrides the equal method?
 * StringBuilder inherites equals method from Object class; it compares the 
 * reference variables, but not content. 
 */
package SB;

/**
 *
 * @author YNZ
 */
public class SbEqual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String str = "hello world";
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println("sb = sb1? " + sb.equals(sb1));

        String s1 = str;
        String s2 = new String(str);
        System.out.println("s1 = s2? " + s1.equals(s2));
        System.out.println("s1==s2? "+ (s1==s2));

    }

}
