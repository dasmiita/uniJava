
 // Printing all perfect numbers in a given range
public class perfect {
    public static void main(String[] args) {
        int n = 1;  
        int r = 50; 

        System.out.println("Perfect numbers between " + n + " and " + r + " are:");
        
        for (int j = n; j <= r; j++) {
            int sum = 0;

            
            for (int i = 1; i <= j/2 ; i++) { 
                if (j % i == 0) {
                    sum += i;
                }
            }

            if (sum == j) {
                System.out.println(j);
            }
        }
    }
}

 