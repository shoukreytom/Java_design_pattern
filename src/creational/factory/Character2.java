package creational.factory;

//sub-class 2
public class Character2 extends Characters {

    private final String name;
    private double health;
    private double power;

    public Character2(String name, double health, double power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public double getPower() {
        return power;
    }

}
