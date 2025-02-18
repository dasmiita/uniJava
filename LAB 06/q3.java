/*Shape is the super class for square and rectangle. Write a program to find areas of square 
and rectangle by inheriting shape.  
Method-find_Area() should be declared in shape. Parameters could be changed as per 
needed. */
class Shape {
    void find_Area(int side) {  // For square
        System.out.println("Area of Square: " + (side * side));
    }

    void find_Area(int length, int breadth) {  // For rectangle
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Square extends Shape { }

class Rectangle extends Shape { }

public class q3 {
    public static void main(String[] args) {
        Square sq = new Square();
        Rectangle rect = new Rectangle();

        sq.find_Area(5);          
        rect.find_Area(4, 6);     
    }
}
