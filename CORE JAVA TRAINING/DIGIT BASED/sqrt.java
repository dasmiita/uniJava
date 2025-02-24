import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        
        System.out.println("enter your number = ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i*i<=n;i++){
            if(i*i == n){
                System.out.println("square of the given number is = "+ i);
                break;
            }
            
        }
    }
    
}

/*
 import java.util.Scanner;

public class SqrtFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        sc.close(); // Closing the scanner to avoid resource leaks
        
        boolean found = false;
        
        for (int i = 1; i * i <= n; i++) { // Looping till √n
            if (i * i == n) {
                System.out.println("Square root of " + n + " is " + i);
                found = true;
                break; // Exit once the square root is found
            }
        }
        
        if (!found) {
            System.out.println("No exact integer square root exists.");
        }
    }
}

 */