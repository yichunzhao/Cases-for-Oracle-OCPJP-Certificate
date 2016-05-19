/*
 * Overriding distinguished by 1) the inheritance, and then must be instance 
 * methods. 2) then the same signature and argument(type, sequence and number)
 * 3) return type must be same for the primitive; for the reference type it must
 * be the sub-types. 4) access-modifier must be the same as the super-classs. 
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author YNZ
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Base1.ROOT " + Base.ROOT);
        System.out.println("Base2.ROOT " + Base2.ROOT); //shadowing

        Base b = new Base();
        Base2 b1 = new Base2();

        //invoking which overriden instance method depending on the actually instantiated
        //objects in the runtime. 
        System.out.println(b.getValue());
        System.out.println(b1.getValue());
        
        //instance is able to access the class method and fields.
        //but class method cannot access instance field.
        System.out.println(" "+ b.getSize());
        System.out.println(b1.ROOT);
        System.out.println(""+ b.height);
        System.out.println(""+b1.height);
    }
}
