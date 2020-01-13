package creational.singleton.test;

import creational.singleton.*;

public class Test {

    public static void main(String[] args) {

        //Singleton's methods:
        // (1)
        EagerInitialized eagerInitialized = EagerInitialized.getInstance();
        eagerInitialized.printHelloWorld();

        // (2)
        StaticBlock staticBlock = StaticBlock.getInstance();
        staticBlock.printHelloWorld();

        // (3)
        LazyInitialized lazyInitialized = LazyInitialized.getInstance();
        lazyInitialized.printHelloWorld();

        // (4)
        ThreadSave threadSave = ThreadSave.getInstance();
        threadSave.printHelloWorld();

        // (5)
        BillPugh billPugh = BillPugh.getInstance();
        billPugh.printHelloWorld();

        // (6)
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.printHelloWorld();

    }
}
