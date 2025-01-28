public class array1 {
    public static void main(String[] args) {
        // Initializing array
        int[] arr = {46, 56, 89, 54, 24};
        // Sorting the array using Bubble Sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if the element is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;}}}

        // Traversing and printing the sorted array
        for (int num : arr)
            System.out.println(num + " ");

            int x[][]=new int[2][3];
            for(int i=0;i<x.length;i++)
            {
              for(int j = 0; j<x[i].length;j++)
              {
                System.out.print(x[i][j]+"\t");
              }
              System.out.println(" ");
            }}}
