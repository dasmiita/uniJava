public class swap{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 23;
        System.out.println("ORIGINAL VALUE OF A = " + a);
        System.out.println("ORIGINAL VALUE OF B = " + b);
        int c=0;
         c = a;
         a = b; 
         b = c; 
        System.out.println("SWAPPED VALUE OS A USING A THIRD VARIABLE= " +a);
        System.out.println("SWAPPED VALUE OF B USING A THIRD VARIABLE= " +b);
        System.out.println("________________________________________________");
        int x = 45;
        int y = 34;
        System.out.println("ORIGINAL VALUE OF X = " + x);
        System.out.println("ORIGINAL VALUE OF Y = " + y);
        x += y;
        y = x-y;
        x = x-y;
           System.out.println("SWAPPED VALUE OS x WITHOUT USING A THIRD VARIABLE= " +x);
        System.out.println("SWAPPED VALUE OF y WITHOUT USING A THIRD VARIABLE= " +y);
    }
}