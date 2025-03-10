public class sumPairs {
    public static void main(String[] args) {
        long num = 9411010751L; 
        long temp = num;
        int count = 0;
        
        while (temp > 0) {
            count++;
            temp /= 10;}
        
        int[] digits = new int[count]; 
        temp = num;
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int) (temp % 10);
            temp /= 10;}

        String result = "";

        for (int i = count - 1; i > 0; i -= 2) {
            int sum = digits[i] + digits[i - 1]; 
            result = sum + result; 
        }
        System.out.println(result); 
    }
}
