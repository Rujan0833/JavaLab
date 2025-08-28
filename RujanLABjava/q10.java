package RujanLABjava;

// Single class import and wildcard import are simulated below
import java.util.Date; // single class
import java.util.*;    // wildcard

class Test1 {
    void show(){ System.out.println("Fully Qualified Name Example"); }
}
public class q10 {
    public static void main(String[] args){
        // Fully qualified name
        Test1 t = new Test1();
        t.show();

        // Single class import
        Date d = new Date();
        System.out.println("Date: " + d);

        // Wildcard import (using ArrayList from java.util)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20);
        System.out.println("List: " + list);

        System.out.println("\nLab No.: 10");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}
