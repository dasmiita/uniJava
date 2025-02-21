class plusPattern2 {
    public static void main(String[] args) {
        int n = 7; // Grid size
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) { // Condition for '/' shape
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); // Two spaces for better alignment
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
