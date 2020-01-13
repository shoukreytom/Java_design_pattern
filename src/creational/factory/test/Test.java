package creational.factory.test;

import creational.factory.Characters;
import creational.factory.Classification;

public class Test {

    public static void main(String[] args) {
        Characters character1 = Classification.getCharacter("hands","Jet Li",30,200);
        Characters character2 = Classification.getCharacter("sword","Ninja",20,300);
        Characters character3 = Classification.getCharacter("hat","Monkey",40,350);

        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);
    }
}
