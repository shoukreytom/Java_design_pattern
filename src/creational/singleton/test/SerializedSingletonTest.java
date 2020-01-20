package creational.singleton.test;

import creational.singleton.SerializedSingleton;

import java.io.*;

public class SerializedSingletonTest {

    public static void main(String[] args) throws Exception{
        SerializedSingleton ss1 = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.ser"));
        out.writeObject(ss1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.ser"));
        SerializedSingleton ss2 = (SerializedSingleton)in.readObject();
        in.close();

        System.out.println("ss1: "+ss1.hashCode());
        System.out.println("ss2: "+ss2.hashCode());
    }
}
