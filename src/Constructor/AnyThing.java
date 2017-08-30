/*
 * 
 * private constructor to prevent a class being instantiated. 
 * 
 */
package Constructor;

/**
 *
 * @author YNZ
 */
class GoogleMapClient {

    public GoogleMapClient() {
    }
}

class OpenMapClient {

    public static void getGeoCoder() {
        System.out.println("open map coder ... ");
    }

    private OpenMapClient() {
    }
}

public class AnyThing {

    public static void main(String[] args) {
        GoogleMapClient client = new GoogleMapClient();
        OpenMapClient.getGeoCoder();

    }

}
