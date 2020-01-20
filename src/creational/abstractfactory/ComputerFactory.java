package creational.abstractfactory;

public class ComputerFactory{

    public static Computer createComputer(AbstractFactory computer) {
        return computer.createComputer();
    }
}
