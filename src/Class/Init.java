/*
 * 
 * Constant var. final Type var = init value; it must be initialised as declaring it. 
 * 
 */
package Class;

/**
 *
 * @author YNZ
 */
public class Init {

    static int si = 10;
    int i;
    boolean b;
    //final field needs to be initialised whatever.
    final boolean bool; //1

    //initialisation block; 
    {
        bool = (si > 5);
        i = 1000;
    }
    
    public static void main(String ... args){
     Init i = new Init();   
    }

}
