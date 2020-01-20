package creational.factory;

//sub-class 3
public class Character3 extends Characters {

    private final String name;
    private double health;
    private double power;

    public Character3(String name, double health, double power) {
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
