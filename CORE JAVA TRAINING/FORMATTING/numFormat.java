import java.util.Scanner;
public class numFormat {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println(a + "\n" + b);
        System.out.println("It is \"Core\" Java session");
        System.out.println(a+"+"+b+"="+(a+b));
        int n = 10, n1;
        n1 = n *(n+1)/2;
        System.out.println(n1);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 nums ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum = x+y;
        System.out.println(sum);



    }
    
}
