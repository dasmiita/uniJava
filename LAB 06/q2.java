import java.util.Scanner;

 class Mul {
    int multiply(int num1, int num2) {
        return num1 * num2;}

    int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;}

    int multiply(int arr[], int limit) {
        int temp = 1;
        for (int i = 0; i < limit; i++) {
            temp *= arr[i];}
        return temp;}}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mul obj = new Mul();
        
        System.out.println("Enter the number (Press * to stop):");
        int count = 0;
        int arr[] = new int[100];
        String ch;
        while (sc.hasNext()) {
          String input = sc.next();
            if (input.equals("*")) break;
            arr[count++] = Integer.parseInt(input);}
          
        
        if (count == 2) {
            System.out.println("Multiplying Two numbers called. Result = " + obj.multiply(arr[0], arr[1]));
        } else if (count == 3) {
            System.out.println("Multiplying Three numbers called. Result = " + obj.multiply(arr[0], arr[1], arr[2]));
        } else if (count > 3) {
            System.out.println("Multiplying multiple numbers called. Result =  " + obj.multiply(arr, count));}
        sc.close();}}
