package creational.factory;

//Super-Class
public abstract class Characters {

    public abstract String getName();
    public abstract double getHealth();
    public abstract double getPower();

    //for testing
    @Override
    public String toString() {
        return "Characer= "+getName()+" Health= "+getHealth()+" Power= "+getPower();
    }
}
