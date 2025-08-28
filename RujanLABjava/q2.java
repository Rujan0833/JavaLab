package RujanLABjava;

class Money {
    int rupee;
    int paisa;

    // Method to set values
    void setMoney(int r, int p) {
        rupee = r;
        paisa = p;
    }

    // Method to display values
    void displayMoney() {
        System.out.println(rupee + " Rupee, " + paisa + " Paisa");
    }

    // Method to add two Money objects
    void addMoney(Money m1, Money m2) {
        paisa = m1.paisa + m2.paisa;
        rupee = m1.rupee + m2.rupee;

        // Convert paisa into rupee if >= 100
        if (paisa >= 100) {
            rupee = rupee + paisa / 100;
            paisa = paisa % 100;
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        // Create three Money objects
        Money m1 = new Money();
        Money m2 = new Money();
        Money m3 = new Money();

        // Initialize two objects
        m1.setMoney(5, 75);
        m2.setMoney(7, 30);

        // Add two Money objects into third
        m3.addMoney(m1, m2);

        // Display values
        System.out.print("First Money: ");
        m1.displayMoney();

        System.out.print("Second Money: ");
        m2.displayMoney();

        System.out.print("Sum: ");
        m3.displayMoney();

        // Lab Details
        System.out.println("\n--- Lab Information ---");
        System.out.println("Lab No.: 02");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No: 22081013");
    }
}
