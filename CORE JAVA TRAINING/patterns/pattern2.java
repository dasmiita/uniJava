public class pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {  // Loop for rows
            for (int j = 1; j <= 6; j++) {  // Loop for columns
                if (j==4 && i<=7|| i==7 || i+j==5 && i>=2 && i<=3 || j==1 && i==8) {  
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); // Two spaces for alignment
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
