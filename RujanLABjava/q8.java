package RujanLABjava;

// a) Method Overriding
class Parent {
    void greet(){ System.out.println("Hello from Parent"); }
}
class Child extends Parent {
    void greet(){ System.out.println("Hello from Child"); } // overriding
}

// b) Runtime Polymorphism
abstract class Shape {
    abstract void area();
}
class Rectangle extends Shape {
    int l=5, b=10;
    void area(){ System.out.println("Rectangle area = " + (l*b)); }
}
class Triangle extends Shape {
    int b=6, h=8;
    void area(){ System.out.println("Triangle area = " + (0.5*b*h)); }
}

// c) Abstract Class already shown above (Shape)
// d) Interface for multiple inheritance
interface Printable {
    void print();
}
interface Displayable {
    void display();
}
class Demo implements Printable, Displayable {
    public void print(){ System.out.println("Printing..."); }
    public void display(){ System.out.println("Displaying..."); }
}

public class q8 {
    public static void main(String[] args){
        // a) Method Overriding
        Parent p = new Child();
        p.greet(); // overridden method called

        // b) Runtime Polymorphism
        Shape s1 = new Rectangle();
        Shape s2 = new Triangle();
        s1.area();
        s2.area();

        // d) Interface demonstration
        Demo d = new Demo();
        d.print();
        d.display();

        System.out.println("\nLab No.: 8");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}
