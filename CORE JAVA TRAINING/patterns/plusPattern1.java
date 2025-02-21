public class plusPattern1 {
    public static void main(String[] args) {
        System.out.println("Plus pattern programming:");

        int n = 7; // Size of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n / 2) + 1 || j == (n / 2) + 1) {
                    System.out.print("+ "); 
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}

