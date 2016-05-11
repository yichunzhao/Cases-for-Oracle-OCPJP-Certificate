/*
 * in this case you will see how a big difference due to selecting var. types.
 * in the division, it may give float results, but it will be rounded as int, lossing accuracy a lot. 
 * 
 */
package DataTypes;

/**
 *
 * @author YNZ
 */
public class CastByVarType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rate = 10; //so the best define rate as floating type, float or double. 
        float amount = 1 - rate / 100 * 1 - rate / 100;
        float rate_=10;
        float amount1 = 1 - rate_ / 100 * 1 - rate_ / 100;
        System.out.println(amount);
        System.out.println(amount1);
    }

}
