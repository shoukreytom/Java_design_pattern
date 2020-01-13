package creational.singleton.test;

import creational.singleton.EagerInitialized;

import java.lang.reflect.Constructor;

public class SingletonReflectionTest {

    public static void main(String[] args) {

        EagerInitialized i1 = EagerInitialized.getInstance();
        EagerInitialized i2 = null;
        EagerInitialized i3 = EagerInitialized.getInstance();

        try {
            Constructor[] constructors = EagerInitialized.class.getDeclaredConstructors();

            for(Constructor c: constructors) {
                c.setAccessible(true);
                i2 = (EagerInitialized) c.newInstance();
                break;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("i1: "+i1.hashCode());
        System.out.println("i2: "+i2.hashCode());
        System.out.println("i3: "+i3.hashCode());
    }
}
