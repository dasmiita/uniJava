//Create a three-level inheritance hierarchy with classes like Animal, Mammal, and Dog. Add attributes and methods to demonstrate multilevel inheritance.

// Base class
class ani {
    int population;
    String foundAt;

    public void display() {
        System.out.println("Animals have an enormous population of " + population);
        System.out.println("Found at: " + foundAt);}}

//  class inheriting from Animal
class Mammal extends ani {
    boolean hasFur;
    boolean givesBirth;

    public void mammalInfo() {
        System.out.println("Has fur: " + hasFur);
        System.out.println("Gives birth: " + givesBirth);}}

//  class inheriting from Mammal
class Dog extends Mammal {
    String breed;
    String sound;

    public void dogInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Sound: " + sound);}}

// Main class
public class animal {
    public static void main(String[] args) {
        Dog d = new Dog(); //ab dog has properties of all animal and mammals both
        
        d.population = 900000000; 
        d.foundAt = "Worldwide";
        d.hasFur = true;
        d.givesBirth = true;
        d.breed = "Labrador";
        d.sound = "Bark";

        d.display();     // From Animal
        d.mammalInfo();  // From Mammal
        d.dogInfo();     // From Dog
}}
