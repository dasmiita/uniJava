public class countFactors {
    public static void main(String[] args) {
        int num = 10;
        int count = 0;
        System.out.println("factors of "+num+" are = ");
        for(int i=1;i<num;i++)
        { 
            if(num%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}


