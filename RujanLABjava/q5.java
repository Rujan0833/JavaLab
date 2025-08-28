package RujanLABjava;

class Demo {
    // a) static variable
    static int count = 0;

    // b) static method
    static void showCount() {
        System.out.println("Count = " + count);
    }

    // c) static block
    static {
        System.out.println("Static Block Executed");
    }

    // d) final keyword
    final int num = 10;                // final variable
    final void display() {             // final method
        System.out.println("Final Method, num = " + num);
    }
}

// final class cannot be inherited
final class FinalClass {}

public class q5 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        // modify static variable
        Demo.count++;
        Demo.showCount();

        // call final method
        d1.display();
         // --- Lab Information ---
        System.out.println("\n--- Lab Information ---");
        System.out.println("Lab No.: 03");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No: 22081013");
    }
    }

