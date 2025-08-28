import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q17Eventhand extends JFrame implements ActionListener {

    public q17Eventhand() {
        // Setup the frame
        setTitle("Event Handling Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 1. Within the same class
        JButton sameClassButton = new JButton("Same Class");
        sameClassButton.addActionListener(this); 
        add(sameClassButton);

        // 2. Within an inner class (retains same logic for clarity)
        JButton innerClassButton = new JButton("Inner Class");
        innerClassButton.addActionListener(new InnerClassListener());
        add(innerClassButton);

        // 3. Within an anonymous inner class using a lambda expression
        JButton anonymousClassButton = new JButton("Anonymous Inner Class");
        anonymousClassButton.addActionListener(e -> System.out.println("Button clicked! (Anonymous Inner Class using Lambda)"));
        add(anonymousClassButton);

        // 4. At another class
        JButton otherClassButton = new JButton("Other Class");
        otherClassButton.addActionListener(new OtherClassListener());
        add(otherClassButton);
        
        setVisible(true);
    }

    // 1. Event handling logic within the same class (as the JFrame)
    @Override
    public void actionPerformed(ActionEvent e) {
        // Use a conditional to determine which button was clicked
        if (e.getActionCommand().equals("Same Class")) {
            System.out.println("Button clicked! (Same Class)");
        }
    }

    // 2. Event handling logic within an inner class
    private class InnerClassListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked! (Inner Class)");
        }
    }

    // 4. Event handling logic in another class
    private static class OtherClassListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked! (Other Class)");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q17Eventhand::new);
    }
}
