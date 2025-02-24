//program to print multiplication tables from 1 to 10 
public class table {
    public static void main(String[] args) {
    int mul=0;
    int n=10;
    for(int i=1;i<=n;i++){
        System.out.println("multiplication table of "+ i + " is");
        for ( int j=1 ;j<=10;j++){
           mul =  (i*j);
           System.out.println(i + " x " + j + " = " + mul);

        }
        
    }
}}
