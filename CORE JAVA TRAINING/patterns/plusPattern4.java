public class plusPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {  // Loop for rows
            for (int j = 1; j <= 7; j++) {  // Loop for columns
                if (i == j || i+j==8 || i==1|| j==1 || i==7 || j==7) {  // Condition for '\' shape
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); // Two spaces for better alignment
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
