package creational.abstractfactory;

public class Server extends Computer {

    private String name;
    private String type;
    private String model;
    private String factory;

    public Server(String name,String type,String model,String factory) {
        this.name = name;
        this.type = type;
        this.model = model;
        this.factory = factory;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getFactory() {
        return factory;
    }
}
