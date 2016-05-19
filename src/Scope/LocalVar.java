package Scope;

/**
 *
 * @author YNZ
 */
public class LocalVar {
    static int i;
    
    
    public static void main(String[] args) {
        //int i=0; local var. must be init. before using it. 
        
        //local var. hiding the class field i.
        //Well, this is a java feature. this is not an error. 
        for (int i = 0; i < 10; i++) { //local var. i within scope of for loop.
            System.out.print(" " + Math.random());
        }
        
        System.out.println("");
        for (int i = 0; i < 10; i++) {//local var. i with scope of for loop.
            System.out.print(" "+ Math.random());
        }
        
        System.out.print("\n");
    }
    
    public void m(){
        int d; //method variable(local var.) 
        //d++, it must be init. before using it; otherwise it gives comipling error. 
        {{}};
    }
}
