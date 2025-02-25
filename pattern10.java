//star pattern
public class pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 13; j++) {  
                if (i==3 || i==7 || i-j==2 && i>=3 && i<=9 || i+j==8 && i>=1 && i <=7 || i+j ==16 && i>=3 && i<=9 || j-i ==6 && j>=7 && j<=13) {  
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); // 
        }
    }
}