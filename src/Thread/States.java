/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.Set;

/**
 *
 * @author YNZ
 */
class MyTh implements Runnable {

    public MyTh() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {

            System.out.println("" + i);
        }
    }
}

public class States {

    public static void main(String[] args) {

        Thread t = new Thread(new MyTh());
        t.setName("MyTh");
        t.start();
        t.run();

        System.out.println("state:  " + t.getState());
        System.out.println(Thread.getAllStackTraces().keySet());
        Set<Thread> thSet = Thread.getAllStackTraces().keySet();

        for (Thread tt : thSet) {
             System.out.println(""+tt.getName()+ " "+tt.getState());
        }
        
        System.out.println("current thread " + Thread.currentThread().getName());

    }

}
