package creational.builder.test;

import creational.builder.Computer;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("3GB","500GB").
                setIsMultiCore(true).setIsScreenTouch(true).build();
        System.out.println(computer.getRAM());
        System.out.println(computer.getDISK());
        System.out.println(computer.isMultiCore());
        System.out.println(computer.isScreenTouch());
    }
}
