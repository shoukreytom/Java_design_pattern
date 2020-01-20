package creational.singleton;

public class ThreadSave {

    private static ThreadSave threadSave;

    private ThreadSave() {}

    /*
    //It reduces the performance
    @Deprecated
    public static synchronized ThreadSave getInstance() {
        if(threadSave == null) {
            threadSave = new ThreadSave();
        }
        return threadSave;
    }
    */

    //used (Double checked locking) method for better performance
    public static ThreadSave getInstance() {

        if(threadSave == null) {
            synchronized (ThreadSave.class) {
                threadSave = new ThreadSave();
            }
        }
        return threadSave;
    }

    /**add some functions to ensure that it works, let's add function that prints
     * "Hello World"
     */
    public void printHelloWorld() {
        System.out.println("ThreadSaveSingleton: Hello World");
    }
}
