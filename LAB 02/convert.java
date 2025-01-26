import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Convert to binary
        String binary = "";
        int temp = num;
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp /= 2;}
        
        // Convert to hexadecimal
        String hex = "";
        temp = num;
        while (temp > 0) {
            int remainder = temp % 16;
            if (remainder < 10) {
                hex = remainder + hex;  // For digits 0-9
            } else {
                hex = (char) (remainder - 10 + 'A') + hex;  // For letters A-F
    }
            temp /= 16;}
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex);

        sc.close();
    }}
