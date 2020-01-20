package creational.abstractfactory;

public class PCFactory implements AbstractFactory {

    private String name;
    private String type;
    private String model;
    private String factory;

    public PCFactory(String name,String type,String model,String factory) {
        this.name = name;
        this.type = type;
        this.model = model;
        this.factory = factory;
    }

    @Override
    public Computer createComputer() {
        return new PC(name,type,model,factory);
    }
}
