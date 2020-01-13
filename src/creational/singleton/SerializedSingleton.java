package creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 3L;

    private static class HelperClass {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return HelperClass.INSTANCE;
    }

    /**must provide this method to overcome singleton destroy
     *for better experience test this class (with & without)
     * this method in SerializeSingletonTest class
     */
    protected Object readResolve() {
        return getInstance();
    }
}
