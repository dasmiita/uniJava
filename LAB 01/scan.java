/*Taking input in java*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter first value = ");
        number1 = sc.nextInt(); 
        System.out.println("Enter second value = ");
        number2 = sc.nextInt();
        System.out.println("Value is = " + number1);
        System.out.println("Value is = " + number2);
        int res = number1 + number2;
        System.out.println("Addition is = " + res);

    }
}
