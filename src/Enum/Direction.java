/*
 * In Java, Enum is a class type. 
 * 
 * 
 */
package Enum;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public enum Direction {
    EAST(10), SOUTH(20), WEST(40), NORTH(30);
    
    //Enum constructor must be private or pakage-private(default access modifier)
    private Direction(double degree) {
        this.degree = degree;
    }

    private Direction() {
        this.degree = 0;
    }

    public static Direction getEAST() {
        return EAST;
    }

    public static Direction getNORTH() {
        return NORTH;
    }

    public static Direction getWEST() {
        return WEST;
    }

    public double getDegree() {
        return degree;
    }

    public static Direction getSOUTH() {
        return SOUTH;
    }

    @Override
    public String toString() {
        return this.name() + " " + this.getDegree();
    }
    
    //init. once as it is contructed. 
    private final double degree;
}


class UsingEnum {

    public static void main(String[] args) {
        System.out.println(Direction.EAST);
        Direction d = Direction.valueOf("EAST");
        System.out.println("" + d);
        System.out.println(Arrays.toString(Direction.values()));
        
        tellDirection(Direction.EAST);
        tellDirection(Direction.NORTH);
        
        //adding get method to return client attribute. 
        System.out.println(""+Direction.EAST.getDegree());
        
        //how to traverse Enum members by a loop
        for(Direction direction: Direction.values()){
            System.out.println(direction.name() + " " +direction.getDegree());
        }
        //overriding toString() to print out enum member properties.
        System.out.println(" "+ Arrays.toString(Direction.values()));
                
        
    }

    public static void tellDirection(Direction direction) {
        //Enum value can be inferred without using identifier. 
        switch (direction) {
            case EAST:
                System.out.println("Goto East.");
                break;
            case SOUTH:
                System.out.println("Goto South");
                break;
            case WEST:
                System.out.println("Goto West");
                break;
            case NORTH:
                System.out.println("Goto North");
                break;
            default:
                System.out.println("Goto no where");

        }

    }
}
