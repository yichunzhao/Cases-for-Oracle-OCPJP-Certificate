/*
 * String is immutable. once the string object created then it cannot be modified.
 * immutable doesn't mean it because String is a final class. it is not the same thing. 
 * 
 */
package String;

/**
 *
 * @author YNZ
 */
public class Immutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //I assume it is safe in multi-thread context. how you can change its content?
        Student student = new Student("Yichun", "Zhao");
        student = new Student("Wenqi", "Huang");
        //result shows Wenqi Huang; so it is not immutable. 
        System.out.println("this student = " + student.getFirstName() + " " + student.getLastName());

        String str1 = "Netto emtrup 1234";
        System.out.println(str1.contains("Netto"));

        String str2 = "Hello";
        String str3 = str2.replace('H', 'x');
        System.out.println(str2==str3); //creating a new String instance
        System.out.println(str3);

    }
}
