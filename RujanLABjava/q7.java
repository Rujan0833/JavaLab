package RujanLABjava;

class A { // Parent
    int x = 10;
    A(){ System.out.println("A's constructor"); }
}

class B extends A { // Child
    int x = 20;
    B(){ 
        super(); // call parent constructor
        System.out.println("B's constructor");
    }
    void show(){ 
        System.out.println("Child x = " + x + ", Parent x = " + super.x); // name hiding
    }
}

class C extends B { // Grandchild (multilevel)
    int y = 30;
    C(){ System.out.println("C's constructor"); }
    void display(){ System.out.println("y = " + y); }
}

public class q7 {
    public static void main(String[] args){
        B b = new B();
        b.show(); // access parent member with super

        C c = new C(); // multilevel inheritance
        c.display();

        System.out.println("\nLab No.: 7");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}

