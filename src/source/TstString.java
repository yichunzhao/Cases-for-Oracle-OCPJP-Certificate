/*
 * str1 == str2 : comparing reference
 * str1.equals(str2) : comparing the content. 
 * StringBuilder is faster, for it has no sync.; but StringBuffer has been sycn.
 * 
 */
package source;

import java.lang.reflect.Field;

/**
 * @author YNZ
 */
public class TstString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "ynz";
        String str2 = new String("ynz");
        String str3 = "ynz";
        
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        
        Field[] flds =str1.getClass().getFields();
        System.out.println(flds.toString());
        System.out.println(str2.getClass().getFields().toString());
        System.out.println(str3.getClass().getFields().toString());
        System.out.println(str1.getClass().toString() );
        
        
        if(str1==str2){
            System.out.println("str1=str2");
        }else{
            System.out.println("str1 and str2 not equal");
        }
                        
        if(str1==str3){
            System.out.println("str1=str3");
        }else{
            System.out.println("str1 and str3 not equal");
        }
        
        System.out.println("as using equals ...................");
        
        if(str1.equals(str2)){
            System.out.println("str1=str2");
        }else{
            System.out.println("not equal");
        }
        
        StringBuffer sb = new StringBuffer();
        System.out.println("current capacity=" +sb.capacity());
        sb.append(str3);
        sb.append(str1);
        sb.append("dddddddddddddddddddddddddddddddddddddddddddddddddddddddstr3");
        System.out.println("current capacity=" +sb.capacity());
        

        StringBuilder sb1 = new StringBuilder();
        System.out.println("current capacity=" +sb1.capacity());
        sb1.append(str3);
        sb1.append(str1);
        sb1.append("dddddddddddddddddddddddddddddddddddddddddddddddddddddddstr3");
        System.out.println("current capacity=" +sb1.capacity());
        System.out.println("sb1=" +sb1.toString());
        
    }
    
}
