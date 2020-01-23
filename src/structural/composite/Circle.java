package structural.composite;

//leaf tow
public class Circle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println(color + "Drawing Circle...");
    }
}
