package structural.composite;

//leaf one
public class Squire implements Shape {

    @Override
    public void draw(String color) {
        System.out.println(color + "Drawing squire...");
    }
}
