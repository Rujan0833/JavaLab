package RujanLABjava;

class Outer {
    static int x = 10;
    int y = 20;

    // a) Static Nested Class
    static class StaticNested {
        void show() { System.out.println("Static Nested x = " + x); }
    }

    // b) Non-static Nested Class (Inner Class)
    class Inner {
        void display() { System.out.println("Inner y = " + y); }
    }

    // c) Local Inner Class
    void localMethod() {
        class Local {
            void print() { System.out.println("Local Inner Class"); }
        }
        Local l = new Local();
        l.print();
    }
}

public class q9 {
    public static void main(String[] args){
        // a) Static Nested Class
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.show();

        // b) Inner Class
        Outer o = new Outer();
        Outer.Inner in = o.new Inner();
        in.display();

        // c) Local Inner Class
        o.localMethod();

        System.out.println("\nLab No.: 9");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}
