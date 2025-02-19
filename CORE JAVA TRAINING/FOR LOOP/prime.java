import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num = ");
        int num = sc.nextInt();
        if(num <= 1){
            System.out.println("not prime");}
        int fac=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                fac++;
                break;}}
        if(fac==0){
            System.out.println("prime");}
        else{
            System.out.println("not prime");}}}
