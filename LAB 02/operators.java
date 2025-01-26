//WAP to display the use of arithmetic, logical and relational operators on two variables.
public class operators{
    public static void main(String[] args)
    {
        int a = 40, b = 20;
        System.out.println("ARITHMETIC OPERATORS:");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a x b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        System.out.println("RELATIONAL OPERATORS:");
        System.out.println("a > b = " + (a>b));
        System.out.println("a < b = " + (a<b));
        System.out.println("a = b = " + (a==b));
        System.out.println("a != b = " + (a!=b));

        System.out.println("LOGICAL OPERATORS:");
        boolean x=true, y = false;
        System.out.println("x AND y = " + (x&&y));
        System.out.println("x OR y = " + (x||y));
        System.out.println("NOT X = " + (!x));

    }
}