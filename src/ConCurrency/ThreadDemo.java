/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConCurrency;

/**
 *
 * @author YNZ
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int times=10;
        StringBuffer sb= new StringBuffer();
        sb.append("start");
        Thread th1 = new Thread(new MyRunnable(times,sb), "th1");
        Thread th2 = new Thread(new OtherRunnable(times,sb), "th2");
        Th3 th3 = new Th3(times,sb);
        System.out.println(sb.toString());
        
        th1.start();
        th2.start();
        th3.start();
        
        th1.getName();
        //ThreadGroup tg = new ThreadGroup(name);
        System.out.println(sb.toString());

    }

}
