public class pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 11; j++) {  
                if (i+j==7 && j<=6 || j-i == 5 && j>=6 || i==4 && j<=9 && j>=3) {  
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); // 
        }
    }
}