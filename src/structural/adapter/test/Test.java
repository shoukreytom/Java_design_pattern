package structural.adapter.test;

import structural.adapter.SocketClassAdapter;
import structural.adapter.SocketObjectAdapter;
import structural.adapter.Volt;

public class Test {

    public static void main(String[] args) {
        output1();
        System.out.println("=================");
        output2();
    }

    private static void output1() {
        SocketClassAdapter sc = new SocketClassAdapter();
        Volt v = sc.get9Volt();
        Volt v1 = sc.get18Volt();
        Volt v2 = sc.get21Volt();
        System.out.println(v.getVolts());
        System.out.println(v1.getVolts());
        System.out.println(v2.getVolts());
    }

    private static void output2() {
        SocketObjectAdapter sc = new SocketObjectAdapter();
        Volt v = sc.get9Volt();
        Volt v1 = sc.get18Volt();
        Volt v2 = sc.get21Volt();
        System.out.println(v.getVolts());
        System.out.println(v1.getVolts());
        System.out.println(v2.getVolts());
    }
}
