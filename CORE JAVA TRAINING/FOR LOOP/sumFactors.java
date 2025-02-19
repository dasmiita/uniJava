public class sumFactors {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        System.out.println("factors of "+num+" are = ");
        for(int i=1;i<num;i++)
        { 
            if(num%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
