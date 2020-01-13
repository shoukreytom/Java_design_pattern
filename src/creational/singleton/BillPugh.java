package creational.singleton;

/**
 * This method uses helper class for initializing instance of singleton class
 */

public class BillPugh {

    private BillPugh() {}

    //helper class
    private static class HelperClass {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance() {
        return HelperClass.INSTANCE;
    }

    /**add some functions to ensure that it works, let's add function that prints
     * "Hello World"
     */
    public void printHelloWorld() {
        System.out.println("BillPughSingleton: Hello World");
    }
}
