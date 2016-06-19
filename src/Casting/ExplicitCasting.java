/*
 * implicit casting, widening, automated. 
 * 
 * byte(8)->short(16)->int(32)-> long(64)->float(64)-> double(64)
 * excluding char(16)  unsinged
 */
package Casting;

/**
 *
 * @author YNZ
 */
public class ExplicitCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        //byte short int long are integer types, but not char
        //char is not interger and decimal(floating)
        char c = 10000;
        c = (char) b;
        c = (char) s;
        c = (char) i;
        c = (char) l;
        c = (char) f;
        c = (char) d;

        i = c;  //int is big enough to  hold char
        l = c;  //long is big enough
        s = (short) c;  //no
        b = (byte) c;   //no
        f = c;
        d = c;
    }

}
