package creational.factory;

//this class implements Factory Design Pattern
public class Classification {

    public static Characters getCharacter(String weapon,String name,double health,double power) {
       if(weapon.equalsIgnoreCase("Sword")) {
           return new Character3(name,health,power);
       }else if (weapon.equalsIgnoreCase("Hat")) {
           return new Character2(name,health,power);
       }else if(weapon.equalsIgnoreCase("Hands")){
           return new Character1(name,health,power);
       }
       return null;
    }
}
