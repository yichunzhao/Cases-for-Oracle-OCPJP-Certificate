/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

/**
 *
 * @author YNZ
 */
class MyException2 extends Exception {

    public MyException2() {
        super();
    }

    @Override
    public String toString() {
        return "this is my exception 2 ";
    }

}

public class ExOPP {

    /**
     * @param args the command line arguments
     * @throws Ex.MyException
     *
     */
    public static void main(String[] args) throws MyException {
        A a = new A();
        try {
            a.doWell();
            try {
                throw new MyException2();
                //a.polish(); //this exception is not caught. for doWell throw early. 
            } catch (MyException2 ex) {
                System.out.println(ex);
            }
        } catch (MyException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("finally whatever");
        }

    }

}
