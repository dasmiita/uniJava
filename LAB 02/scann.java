import java.util.Scanner;

public class scann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store employee details
        String[] names = new String[5];
        int[] ids = new int[5];
        double[] salaries = new double[5];

        // Taking input for 5 employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            
            System.out.print("Enter ID: ");
            ids[i] = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salaries[i] = sc.nextDouble();
        }

        sc.close(); // Close Scanner after all input

        // Displaying employee details
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmployee " + (i + 1) + " Details:");
            System.out.println("ID: " + ids[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Salary: " + salaries[i]);
            System.out.println("------------------------");
        }
    }
}
