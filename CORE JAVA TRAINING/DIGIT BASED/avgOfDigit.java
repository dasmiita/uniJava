
public class avgOfDigit {
    public static void main(String[] args) {
        
    
        int n=56789;
        int sum =0;
        int count=0;
        while(n!=0){
            int lst = n%10;
            sum = sum + lst;
            count++;
        n=n/10;}
            int avg=sum/count;
        System.out.println("avg = " + avg);

        }
}

