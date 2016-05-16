/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Label;

/**
 *
 * @author YNZ
 */
class BreakLabel {

    public static void main(String args[]) {
        int i = 0;
        loop: // 1
        {
            System.out.println("Loop Lable line");
            try {
                for (; true; i++) {
                    if (i > 5) {
                        System.out.println("i=" + i);

                        break loop; // 2

                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in loop.");
            } finally {
                System.out.println("In Finally"); // 3
            }
        }

        i = 0;
        block: // 1
        {
            System.out.println("Block Lable line");
            for (; true; i++) {
                if (i > 5) {
                    System.out.println("i=" + i);
                    break block; // 2
                }
            }

        }

        System.out.println("outside the foor loop");

    }

}
