import java.util.Scanner;

public class ArraySort{
    public static void main(String[] args)
    {
        int arr[] = {1,2,34,45,62,71,43,8};
        int n= arr.length;
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;}}}

        System.out.println("array aftet sort:");
        for (int num : arr)
            System.out.print(num + " ");
            
        int highest = arr[n-1];
        int lowest = arr[n-8];
        System.out.println("highest element is = " + highest);
        System.out.println("lowest element is =" + lowest);   

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element " + key + " not found in the array.");
            }}