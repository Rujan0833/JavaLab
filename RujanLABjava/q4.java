package RujanLABjava;

/**
 * This class demonstrates both constructor and method overloading.
 */
class OverloadDemo {
    int value1;
    String value2;

    // --- Constructor Overloading ---
    // 1. Default Constructor
    OverloadDemo() {
        this.value1 = 0;
        this.value2 = "Default";
        System.out.println("Default constructor called.");
    }

    // 2. Constructor with one parameter
    OverloadDemo(int v1) {
        this.value1 = v1;
        this.value2 = "Custom";
        System.out.println("Constructor with one int called.");
    }

    // 3. Constructor with two parameters
    OverloadDemo(int v1, String v2) {
        this.value1 = v1;
        this.value2 = v2;
        System.out.println("Constructor with int and String called.");
    }

    // --- Method Overloading ---
    // 1. Add method for integers
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Add method for doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Display method to show object state
    public void display() {
        System.out.println("Value1: " + value1 + ", Value2: " + value2);
    }
}

public class q4 {
    public static void main(String[] args) {
        System.out.println("--- Constructor Overloading Demo ---");
        OverloadDemo obj1 = new OverloadDemo(); // Calls default constructor
        obj1.display();

        OverloadDemo obj2 = new OverloadDemo(100); // Calls constructor with one param
        obj2.display();
        
        OverloadDemo obj3 = new OverloadDemo(200, "Hello"); // Calls constructor with two params
        obj3.display();

        System.out.println("\n--- Method Overloading Demo ---");
        System.out.println("Sum of integers (5, 10): " + obj1.add(5, 10));
        System.out.println("Sum of doubles (3.5, 2.5): " + obj1.add(3.5, 2.5));

        // --- Lab Information ---
        System.out.println("\n--- Lab Information ---");
        System.out.println("Lab No.: 03");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No: 22081013");
    }
}
