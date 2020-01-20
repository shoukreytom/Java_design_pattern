package creational.singleton;

/**
 * In this method the instance of class is Initialized at beginning of class loading
 */

public class EagerInitialized {

    //private static variable of the same class (only instance of the class).
    private static final EagerInitialized EAGER_INITIALIZED = new EagerInitialized();

    //private constructor to restrict its instantiation from other classes
    private EagerInitialized(){}

    //public static method that returns the instance of the class
    public static EagerInitialized getInstance() {
        return EAGER_INITIALIZED;
    }

    /**add some functions to ensure that it works, let's add function that prints
     * "Hello World"
     */
    public void printHelloWorld() {
        System.out.println("EagerInitializedSingleton: Hello World");
    }
}
