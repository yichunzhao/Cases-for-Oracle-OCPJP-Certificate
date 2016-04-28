/*
 * Java really pass by value? not exactly. 
 * Java reference has a pointer property. 
 * In another side, it has also value property. 
 * We cannot say java pass by value(copy) or pointer. it includes both views. 
 * you may operate on the passed object by its reference; you may change it within
 * a local method from a global view. You 

 */
package Class;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class PassByValue {

    public void changeIt(ArrayList<Number> list) {
        list.add(200);
        ArrayList<Number> oneList = new ArrayList<>();
        //oneList = list; 
        //oneList and list ref. to the same object now
        //and the new number can be added. 
        //oneList.add(300);

        //can we do another way around
        list = oneList;
        System.out.println("oneList= " + oneList);
        System.out.println("after re-assigned to oneList" + list);
        
        //however you cannot point a passed reference to a new object within 
        //a local method from a gloabal view. I guess this has been prohibited.
        //certainly, in the local scope, you see the passed reference has been
        //pointed to the 'oneList'; when the method returns, its original reference
        //will be recovered. from this view, it is a value. So in java, passing an
        //object, maybe contain several mechanism; which has been designed. 

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(109);
        list.add(12.9f);
        System.out.println(list);

        //java pass by values? no ....
        //java only pass by values on the primitive types. 
        //list reference won't be changed in the method. so it still referred to
        //the original List object. 
        new PassByValue().changeIt(list);
        System.out.println(list);

    }

}
