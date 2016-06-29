/*
 * valid lable JACK: 
 * Must label a block code {}
 * 
 */
package Label;

/**
 *
 * @author YNZ
 */
public class LabelWhere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int c = 0;
        JACK:
        while (c < 8) {
            //JILL:  here is not valid
            System.out.println(c);
            // here is valid
            if (c > 3) {
                break JACK;
            } else {
                c++;
            }
        }
    }

}
