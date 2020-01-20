package creational.abstractfactory.test;

import creational.abstractfactory.*;

public class Test {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(
                new PCFactory("SH","Laptop","p6660","Toshiba"));
        Computer server = ComputerFactory.createComputer(
                new ServerFactory("Kali","Server","k3","HP"));
        System.out.println(pc);
        System.out.println(server);
    }
}
