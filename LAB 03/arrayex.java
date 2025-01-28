public class Array1 {
    public static void main(String[] args) {
        // Initializing array
        int[] arr = {46, 56, 89, 54, 24};

        // Sorting the array using Bubble Sort (Ascending Order)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if the element is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }}}

        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
        
        
        int first = arr[n - 3];
        int second = arr[n - 2];
        int third = arr[n - 1];

        System.out.println("\nGreatest 3 elements:");
        System.out.println(first + " " + second + " " + third);

        // Multiplying the greatest 3 elements
        int product = first * second * third;
        System.out.println("Product of greatest 3 elements: " + product);
    }
}
