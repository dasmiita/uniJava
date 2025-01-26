import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculate the sum of the digits
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;}
        
        // Check if the sum of digits is Prime
        boolean prime = true;
        if (sum <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    prime = false;
                    break;
                }}}

        // Check if the sum of digits is Armstrong
        int digits = 0, sumArmstrong = 0, originalSum = sum;
        temp = sum;
        while (temp != 0) {
            temp /= 10;
            digits++;}
        temp = sum;
        while (temp != 0) {
            int remainder = temp % 10;
            sumArmstrong += Math.pow(remainder, digits);
            temp /= 10;}
        
        // Check if the sum of digits is Perfect
        int sumPerfect = 0;
        for (int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0) {
                sumPerfect += i;
            }}

        // Display Results
        System.out.println("Sum of digits: " + sum);
        // Prime check
        if (prime) {
            System.out.println("Prime: Yes");
        } else {
            System.out.println("Prime: No");}

        // Armstrong check
        if (sumArmstrong == originalSum) {
            System.out.println("Armstrong: Yes");
        } else {
            System.out.println("Armstrong: No");}

        // Perfect check
        if (sumPerfect == sum) {
            System.out.println("Perfect: Yes");
        } else {
            System.out.println("Perfect: No");}
        
        sc.close();}}
