package creational.abstractfactory;

public abstract class Computer {

    public abstract String getName();
    public abstract String getType();
    public abstract String getModel();
    public abstract String getFactory();

    @Override
    public String toString() {
        return "Name: "+getName()+" | Type: "+getType()+" | Model: "+getModel()+
                " | Factory: "+getFactory();
    }
}
