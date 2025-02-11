//Create a base class Vehicle with attributes like model and year. Create a subclass Car that inherits from Vehicle and has additional attributes like numDoors and fuelType.

    // Base class
class Vehicle {
    String model;
    int year;

    void show() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);}}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    int numDoors;
    String fuelType;

    void showInfo() {
        show(); 
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);}}

public class vehicleClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        
        c1.model = "BMW";
        c1.year = 2017;
        c1.numDoors = 2;
        c1.fuelType = "Petrol";

        Car c2 = new Car();
        c2.model = "Aston Martin";
        c2.year = 2017;
        c1.numDoors = 2;
        c1.fuelType = "Diesel";

        c1.showInfo();
        c2.showInfo();
    }}

    

