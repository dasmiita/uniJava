//prints largest element in an array
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        int[] arr = new int [5];
        int lar=arr[0];
        System.out.println("enter elements of the array = ");
        Scanner sc = new Scanner(System.in);
    
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int x:arr){
            if(x>lar){
                lar=x;}}
        
        System.out.println(lar);
        sc.close(); }}
    

