/*
 * static init. block and non-static init. block
 * 
 */
package InitBlock;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author YNZ
 */
public class InitBlocks {

    static float sp;
    final static Integer[][] matrix = new Integer[2][3];
    Float[][] instMatrix = new Float[4][6];

    //static init block is a place to init satic field, 
    //as it cannot be done in one line.
    static {
        Random r = new Random();
        for (Integer[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[j] = r.nextInt(100);
            }
        }
    }

    {
        Random r = new Random();
        for (Float[] row : instMatrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = r.nextFloat();
            }
        }
    }

    InitBlocks() {
        //if static field can be modified in the instance. 
        sp = 20;
    }
    
    static <T> void printMatrix(T[][] mat){
        for(T[] row: mat){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        printMatrix(InitBlocks.matrix);
        InitBlocks ib = new InitBlocks();
        printMatrix(ib.instMatrix);
    }
}
