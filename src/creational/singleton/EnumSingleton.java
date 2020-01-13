package creational.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void printHelloWorld() {
        System.out.println("EnumSingleton: Hello World");
    }
}
