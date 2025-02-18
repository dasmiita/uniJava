/* A class 'Box' which contains methods and other details(width, height, depth) to calculate 
volume. 
Another class ‘Boxweight’ contains method for finding cost for shipping the box using weight 
of the box (formula to find cost of shipping= distance in km * volume * cost per km)  
Take cost per KM by the user. 
WAP to find the volume of box and cost to ship using a single object */
import java.util.Scanner;

class Box {
    double width, height, depth;
    Box() {
        width = height = depth = 0;} //why i need default here

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;}

    double volume() {
        return width * height * depth;}}

// Child class 
class BoxWeight extends Box {
    int dist;
    double costPerKm;

    BoxWeight(double width, double height, double depth, int dist, double costPerKm) {
        super(width, height, depth); //parent constructor bulao
        this.dist = dist;
        this.costPerKm = costPerKm;}

    void findCost() {
        double vol = volume(); 
        double cost = dist * vol * costPerKm;
        System.out.println("Volume of Box: " + vol);
        System.out.println("Cost of Shipping: " + cost);}}

// Main class
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter width, height, and depth of the box: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.print("Enter distance to ship (in km): ");
        int dist = sc.nextInt();
        System.out.print("Enter cost per km: ");
        double costKm = sc.nextDouble();
        BoxWeight box = new BoxWeight(w, h, d, dist, costKm);
        box.findCost();

        sc.close();}}
