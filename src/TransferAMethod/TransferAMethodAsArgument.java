/*
 * How to transfer a method as argument
 * 
 * 
 */
package TransferAMethod;

/**
 *
 * @author YNZ
 */
interface Perform {
    public void driving();
}

class Sporter implements Perform {
    @Override
    public void driving() {
        System.out.println("Im an engineer driving on the track!");
    }
}

class Engineer implements Perform{
    @Override
    public void driving() {
        System.out.println("Im an engineer driving on the track!");
    }
}

class Coach {
    public void doCoaching(Perform perform) {
        perform.driving();
    }
}

public class TransferAMethodAsArgument {
    public static void main(String[] args) {
        Coach c = new Coach();
        c.doCoaching(new Sporter());
        c.doCoaching(new Engineer());
    }
}
