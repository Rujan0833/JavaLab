package RujanLABjava;

import java.util.Scanner;

class Student {
    int roll_no;
    void readRoll(int r){ roll_no = r; }
    void displayRoll(){ System.out.println("Roll No: " + roll_no); }
}

class Test extends Student {
    int mark1, mark2;
    void readMarks(int m1, int m2){ mark1 = m1; mark2 = m2; }
    void displayMarks(){ System.out.println("Marks: " + mark1 + ", " + mark2); }
}

class Result extends Test {
    int total;
    void calculateTotal(){ total = mark1 + mark2; }
    void displayTotal(){ System.out.println("Total: " + total); }
}

public class q6 {
    public static void main(String[] args){
        Result r = new Result();
        r.readRoll(101);
        r.readMarks(75, 85);
        r.displayRoll();
        r.displayMarks();
        r.calculateTotal();
        r.displayTotal();

        System.out.println("\nLab No.: 6");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}

