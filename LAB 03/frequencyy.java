import java.util.Arrays;

public class frequencyy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 1};
        System.out.println("Array = ");
        
        for (int x=0; x<arr.length; x++) {
        System.out.print("\t" + arr[x]);}

        System.out.println("");
        Arrays.sort(arr);

        int cur = arr[0];
        int freq = 1;

        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] == cur) {
                freq++;
            } else {
                System.out.println("frequency of " + cur + " is " + freq);
                cur = arr[i];
                freq = 1;}}
        System.out.println("Frequency of " + cur + " is " + freq); }}
