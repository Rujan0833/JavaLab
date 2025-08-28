package RujanLABjava;

interface Shape {
    void area(double x, double y);
    void perimeter(double x, double y);
}

class Rectangle implements Shape {
    double length, breadth;

    // Implementing interface methods
    public void area(double x, double y){
        length = x; breadth = y;
        System.out.println("Area = " + (length*breadth));
    }

    public void perimeter(double x, double y){
        System.out.println("Perimeter = " + 2*(x+y));
    }
}

public class q11 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.area(5,10);
        r.perimeter(5,10);

        System.out.println("\nLab No.: 11");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}
