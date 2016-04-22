/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author YNZ
 */
public class UseGraphic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("number of isntances " + Circle.numberofInstance);
        Graphic circle = new Circle(2, 3, 3.4f);
        System.out.println("number of isntances " + Circle.numberofInstance);
        Graphic circle1 = new Circle(3, 4, 3.4f);
        System.out.println("number of instances " + Circle.numberofInstance);
        circle.draw();
        circle1.draw();
        

    }

}
