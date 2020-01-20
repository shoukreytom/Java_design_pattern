package creational.abstractfactory;

public class ServerFactory implements AbstractFactory{

    private String name;
    private String type;
    private String model;
    private String factory;

    public ServerFactory(String name,String type,String model,String factory) {
        this.name = name;
        this.type = type;
        this.model = model;
        this.factory = factory;
    }

    @Override
    public Computer createComputer() {
        return new Server(name,type,model,factory);
    }
}
