package structural.composite.test;

import structural.composite.Circle;
import structural.composite.Drawing;
import structural.composite.Shape;
import structural.composite.Squire;

public class Test {

    private final static String ANSI_RED = "\u001B[31m";
    private final static String ANSI_GREEN = "\u001B[32m";
    private final static String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape squire = new Squire();

        Drawing drawing = new Drawing();
        drawing.add(circle);
        drawing.add(squire);
        drawing.add(circle);
        drawing.add(squire);

        drawing.draw(ANSI_RED);

        drawing.pop(squire);
        drawing.draw(ANSI_BLUE);

        drawing.clear();

        drawing.add(circle);
        drawing.draw(ANSI_GREEN);
    }
}
