public class hierarchy {
    // Base class (Parent)
class A {
    void showA() {
        System.out.println("Inside Class A");
    }
}

// Derived class (Child of A, Parent of C)
class B extends A {
    void showB() {
        System.out.println("Inside Class B");
    }
}

// Derived class (Child of B)
class C extends B {
    void showC() {
        System.out.println("Inside Class C");
    }
}

// Main class to test the hierarchy
public class hierarchynew {
    public static void main(String[] args) {
        C obj = new C();
        
        // Accessing methods from all classes
        obj.showA();  // Method from Class A
        obj.showB();  // Method from Class B
        obj.showC();  // Method from Class C
    }
}

    
}
