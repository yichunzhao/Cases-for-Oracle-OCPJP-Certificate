/*
 * Pleasee follow the rules to create a corrected overriding equal method.
 * ie. overriding Object.equal(object o) method
 * 
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
class BankAccount {

    String acctNumber;
    int acctType;

    
    public boolean equals(BankAccount anObject) {
        if (anObject instanceof BankAccount) {
            BankAccount b = (BankAccount) anObject;
            return (acctNumber.equals(b.acctNumber)
                    && acctType == b.acctType);
        } else {
            return false;
        }
    }
  
}

public class incorrectEqualMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 4;

        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(b1);
        
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490";
        b2.acctType = 4;
        
        System.out.println(list.contains(b2));
    }

}
