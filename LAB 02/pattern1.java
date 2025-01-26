import java.util.Scanner;
public class pattern1
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");}
            System.out.println(); // Move to the next line after each level
        }
        sc.close();}}
