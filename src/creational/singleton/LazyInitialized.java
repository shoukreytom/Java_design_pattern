package creational.singleton;

/**
 * In this method the instance of class is Initialized inside public access method
 */

public class LazyInitialized {

    private static LazyInitialized lazyInitialized;

    private LazyInitialized(){}

    public static LazyInitialized getInstance() {
        if(lazyInitialized == null) {
            lazyInitialized = new LazyInitialized();
        }
        return lazyInitialized;
    }

    /**add some functions to ensure that it works, let's add function that prints
     * "Hello World"
     */
    public void printHelloWorld() {
        System.out.println("LazyInitializedSingleton: Hello World");
    }
}
