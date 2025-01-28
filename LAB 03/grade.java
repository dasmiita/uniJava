import java.util.Scanner;

public class grade{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int marks[] = new int[5];
        int total = 0;
        System.out.println("Enter marks for 5 subjects (0-100):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");}
            total += marks[i];
        }

        System.out.println("Total Marks: " + total);
        char grade;
        if (total >= 400 && total <= 500) {
            grade = 'O';
        } else if (total >= 300 && total < 400) {
            grade = 'E';
        } else if (total >= 250 && total < 300) {
            grade = 'A';
        } else if (total >= 200 && total < 250) {
            grade = 'B';
        } else {
            grade = 'F';}

        System.out.println("Grade is: " + grade);
        scanner.close();
    }
}
