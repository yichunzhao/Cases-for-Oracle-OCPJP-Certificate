/*
 * 
 * 
 * 
 */
package SB;

/**
 *
 * @author YNZ
 */
class EJavaGuruStringBuilder {

    public static void main(String args[]) {
        StringBuilder ejg = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
        ejg.append(ejg.delete(3, 6));
        System.out.println(ejg);

        StringBuilder sb = new StringBuilder("helloworld");
        System.out.println("" + sb.subSequence(0, 2));
    }
}
