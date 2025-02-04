/* Create a class named shape. Create two objects of shape and calculate the 
area and perimeter */
public class Q4_area {
    public static class shape{
        
        int length;
        int width;
        int area(){
            return length * width;}

        int perimeter(){
            return 2 * (length + width);}}
    public static void main(String[] args) {
        shape rec1= new shape();
        rec1.length = 10;
        rec1.width = 45;
        
        shape rec2 = new shape();
        rec2.length = 23;
        rec2.width = 45;
        int area1 = rec1.area();
        int peri1 = rec1.perimeter();
        System.out.println(area1 + "\t" + peri1);

        int area2= rec2.area();
        int perimeter2=rec2.perimeter();
        System.out.println(area2 + "\t" + perimeter2);



    }
    
}
