/*
 * Class final must be init. as declaring; it cannot be init. by the constructor.
 * Class fields init. on the class loaded. so using constructor to init. maybe 
 * too late. 
 * 
 * whatever, constants neeed to be init.  not matter it belongs to class or instance.
 */
package Num;

/**
 * 
 * @author YNZ
 */
class StaticConstants {

    static public final float SIZE = 12.34f;
    static public final int ID;
    //impl. on class loading. 
    static {
        ID = 100;
    }
}

//Instance constants can be init on constructor moment.
class InstanceConstants{
    final public int width;
    final public int height; 

    public InstanceConstants(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

//Instance constants init. block. 
class InstanceConstantsInitBlock{
    final public int width;
    final public int height; 
    
    //instant init black, jvm copies it into each constructor automatically. 
    {
        width = 20;
        height = 30; 
    }

}
