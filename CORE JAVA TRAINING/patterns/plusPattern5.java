public class plusPattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {  // Loop for rows
            for (int j = 1; j <= 7; j++) {  // Loop for columns
                if (i==4 || j ==7 && i>=1 && i<=4 || j == 1 && i>=4 && i<=7 ) {  
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); // Two spaces for better alignment
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
