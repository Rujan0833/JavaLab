package Part2;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class q19 extends JFrame {

    private JCheckBox checkBox;
    private JTextField textField;

    public q19() {
        setTitle("Extended Event Handling Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        checkBox = new JCheckBox("Check Me");
        textField = new JTextField(15);
        
        // Use an anonymous inner class with a WindowAdapter
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing.");
            }
        });

        // ItemListener with a lambda expression
        checkBox.addItemListener(e -> {
            System.out.println("Item State Changed: " + (e.getStateChange() == ItemEvent.SELECTED ? "Selected" : "Deselected"));
        });

        // FocusListener with an anonymous inner class
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus Gained on text field.");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("Focus Lost on text field.");
            }
        });
        
        // MouseListener using a MouseAdapter
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        
        // KeyListener with an anonymous inner class
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { System.out.println("Key Typed: " + e.getKeyChar()); }
            @Override
            public void keyPressed(KeyEvent e) { System.out.println("Key Pressed: " + e.getKeyChar()); }
            @Override
            public void keyReleased(KeyEvent e) { System.out.println("Key Released: " + e.getKeyChar()); }
        });
        setFocusable(true);
        
        add(new JLabel("Click on the frame, check the box, or type."));
        add(textField);
        add(checkBox);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q19::new);
    }
}
