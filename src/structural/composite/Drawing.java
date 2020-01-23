package structural.composite;

import java.util.*;

//composite
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Shape shape: shapes) {
            shape.draw(color);
        }
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void pop(Shape shape) {
        this.shapes.remove(shape);
    }

    public void clear() {
        this.shapes.clear();
    }
}
