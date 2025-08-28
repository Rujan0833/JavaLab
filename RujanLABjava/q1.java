package RujanLABjava;
class Box {
    // Instance variables
    double length;
    double breadth;
    double height;

    // Method to print box dimensions
    void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }

    // Method to calculate and print volume
    void printVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume: " + volume);
    }
}

public class q1 {
    public static void main(String[] args) {
        // First Box object
        Box box1 = new Box();
        box1.length = 5;
        box1.breadth = 4;
        box1.height = 3;

        System.out.println("Box 1:");
        box1.printDimensions();
        box1.printVolume();

        System.out.println();

        // Second Box object
        Box box2 = new Box();
        box2.length = 7;
        box2.breadth = 6;
        box2.height = 2;

        System.out.println("Box 2:");
        box2.printDimensions();
        box2.printVolume();
    }
}
