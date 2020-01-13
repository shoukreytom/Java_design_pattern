package creational.singleton;

/**
 * In this method the instance of class is Initialized inside static block
 */

public class StaticBlock {

    private static StaticBlock staticBlock;

    private StaticBlock(){}

    //Initialize staticBlock
    static {
        try {
            staticBlock = new StaticBlock();
        }catch (Exception e) {
            throw new RuntimeException("Can't create the instance of singleton class");
        }
    }

    public static StaticBlock getInstance() {
        return staticBlock;
    }

    /**add some functions to ensure that it works, let's add function that prints
     * "Hello World"
     */
    public void printHelloWorld() {
        System.out.println("StaticBlockInitializedSingleton: Hello World");
    }
}
