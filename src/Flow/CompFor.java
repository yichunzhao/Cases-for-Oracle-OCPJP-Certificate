/*
 * unary post-fix higher precdence than unary pre-fix(i++,i--)
 * unary post-fix has the highest precedence.(--i,++i) 
 * then it is * / % (3rd highest)
 */
package Flow;

/**
 *
 * @author YNZ
 */
public class CompFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("A");
        }

        for (int i = 0; i < 3; ++i) {
            System.out.println("B");
        }

        int i = 0, j = 0;
        System.out.println(i++); //uary post-fix has a higher precedence than any other
        System.out.println(++j); //unary post-fix higher than unary ++j; --j
        System.out.println("i= " + i + " j= " + j);

    }
}
