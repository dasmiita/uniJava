public class pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {  // Loop for rows
            for (int j = 1; j <= 6; j++) {  // Loop for columns
                if (i==1|| i+j==7) {  
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); // Two spaces for alignment
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}