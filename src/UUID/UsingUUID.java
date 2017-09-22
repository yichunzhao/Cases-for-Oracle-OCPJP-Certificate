/*
 * Uique identifier
 * 
 * 
 */
package UUID;

import java.util.UUID;

/**
 *
 * @author YNZ
 */
public class UsingUUID {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("" + UUID.randomUUID().toString());
            System.out.println("" + UUID.randomUUID().toString());
            System.out.println("" + UUID.randomUUID().toString());
        }

    }

}
