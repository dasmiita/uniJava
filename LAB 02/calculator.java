import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Display operation choices
        System.out.println("\nChoose an operation:");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATON");
        System.out.println("4. DIVISION");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = sc.nextInt(); // user input stored

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                    System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("ERROR");}
        sc.close(); 
    }}


