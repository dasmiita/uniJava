public class pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {  // Loop for rows
            for (int j = 1; j <= 5; j++) {  // Loop for columns
                if (i==1||i==4||i==7||j==5) {  
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); // Two spaces for alignment
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}