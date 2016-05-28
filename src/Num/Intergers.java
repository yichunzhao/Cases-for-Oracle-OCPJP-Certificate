/*
 * java intergers
 * byte(8), short(16), int(32), long(64)
 * 
 */
package Num;

/**
 *
 * @author YNZ
 */
public class Intergers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b = 127;
        // byte d= 400; not valid. compiling error.

        Byte c = 7;

        //boolean declared by literal true or false. 
        boolean on = true;
        if (true) {

        }
        long l = 2;

        long var1 = 0_100_267_760;
        long var2 = 0x4_13;
//long var3 = 0bx10_BA_75;
        long var4 = 0b10000_10_11;
//long var5 = 0xa10_AG_75;
        long var6 = 0x1_0000_10;
        long var7 = 100__12_12;

        //decimal defualt is double
        float f = 1.333f; //must have a sufix f.

        char r = (char) -12;
        System.out.println(r);

        if (on) {
            do {
                System.out.println("A");
                l--;
            } while (l > 0);
        }

    }

}
