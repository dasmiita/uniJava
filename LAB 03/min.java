import java.util.Arrays;
import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();}
        System.out.println("Original array: " + Arrays.toString(arr));
        
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
        } else {
            Arrays.sort(arr);
            int minProduct = arr[0] * arr[1];
            System.out.println("Minimum product of any two elements: " + minProduct);}
        scanner.close();}}
