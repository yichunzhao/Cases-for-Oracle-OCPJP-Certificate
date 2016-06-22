/*
 * 4 ways to new SB using its default constructors 
 * 1) non-argument constructor 2) String argument constructor 3) capacity 
 * 4) stringBuilder constructor 
 * StringBuilder append object's toString(); 
 * StringBuilder inherites the toString from the Object; this is different from
 * String, where toString() has been overridden. 
 */
package SB;

/**
 *
 * @author YNZ
 */
class person {

    private String name;

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

public class CreateSb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //init. capacity = 16
        StringBuilder sb1 = new StringBuilder("hello world");
        StringBuilder sb2 = new StringBuilder(sb);
        StringBuilder sb3 = new StringBuilder(20);

        sb.append(new person("yichun zhao"));
        System.out.println("" + sb);

        String str = " am here";
        sb.append(str.toCharArray());

        System.out.println("" + sb);

        //can you concate char[] to a string? no. but sb can.
        String str1 = "wenq";
        System.out.println(str1 + true);
        char[] cs = {'a', 'e'};

        sb.append(cs);
        System.out.println("" + sb);

        System.out.println(sb.substring(1, 5));

        //sb append(charsequence, int start, int end)
        str = "Java7";
        System.out.println("str=" + str.trim());
        sb3.append(str, 1, 3);
        System.out.println(sb3);

        char[] cc = str.toCharArray();
        sb3.append(cc, 1, cc.length - 1);
        System.out.println(sb3);

        //stringbuilder is mutable. 
        str = "bon";
        StringBuilder sb4 = new StringBuilder(str);
        //it returns the same reference to the same object.
        StringBuilder sb5 = sb4.insert(2, "bonr");
        System.out.println(sb5);
        System.out.println(sb4 == sb5);
        System.out.println(sb4);

        StringBuilder sb6 = new StringBuilder("123");
        String name = "Java";
        System.out.println(sb6.insert(1, name, 1, 3));

        StringBuilder sb7 = new StringBuilder("123");
        char[] name1 = {'J', 'a', 'v', 'a'};
        System.out.println(sb7.insert(1, name1, 1, 3));

        StringBuilder sb8 = new StringBuilder("0123456");
        sb8.deleteCharAt(2);
        System.out.println(sb8);
        sb8.insert(2, 2);
        System.out.println(sb8);
        sb8.delete(2, 4);
        System.out.println(sb8);
        System.out.println(sb8.reverse());

        //stringBuilder replace 
        StringBuilder sb9 = new StringBuilder("0123456");
        sb9.replace(2, 4, "ABCD");
        System.out.println(sb9);
        
        //string replace
        String str2 = "0123456";
        str2.replace("01", "ABCD");//this operation don't modify str2
        System.out.println(str2.replace("01", "ABCD"));//but return a new string object
        
        
        

    }

}
