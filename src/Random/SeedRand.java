/*
 * A Random without seed, following pure normal distribution of probality.
 * Two Random with the same seed, they will follw the same random number 
 * distribution. You will see from this ex. two independent Random generator
 * may generate two same sequencial random numbers, if they use the same seed. 
 */
package Random;

import java.util.Random;

/**
 *
 * @author YNZ
 */
public class SeedRand {

    static private Random r1 = new Random(10);
    static private Random r2 = new Random(10);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] results = new int[2][10];

        for (int i = 0; i < results[0].length; i++) {
            //System.out.println("r1 " + r1.nextInt());
            results[0][i] = r1.nextInt();
        }

        for (int i = 0; i < results[1].length; i++) {
            //System.out.println("r2 " + r2.nextInt());
            results[1][i] = r2.nextInt();
        }
        
        for(int[] e: results){
            for(int i=0; i<e.length;i++){
                System.out.print(" "+e[i]);
            }
            System.out.println("\n");
        }

    }

}
