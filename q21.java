import javax.swing.*;
import java.awt.event.*;

public class q21 extends JFrame {

    public q21() {
        setTitle("Minimal Menu Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // --- 'File' Menu ---
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        // A single menu item demonstrating multiple features
        JMenuItem multiFeatureItem = new JMenuItem("New (Ctrl+N)", new ImageIcon("path/to/bird_2.jpg"));
        multiFeatureItem.setMnemonic(KeyEvent.VK_N);
        multiFeatureItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        multiFeatureItem.addActionListener(e -> {
            System.out.println("Action on: " + e.getActionCommand());
        });
        fileMenu.add(multiFeatureItem);

        // Checkable menu item
        JCheckBoxMenuItem checkItem = new JCheckBoxMenuItem("Checkable", true);
        fileMenu.add(checkItem);
        
        // Radio button group
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButtonMenuItem radioItem1 = new JRadioButtonMenuItem("Option 1", true);
        JRadioButtonMenuItem radioItem2 = new JRadioButtonMenuItem("Option 2");
        radioGroup.add(radioItem1);
        radioGroup.add(radioItem2);
        fileMenu.add(radioItem1);
        fileMenu.add(radioItem2);

        // A disabled item that gets enabled by an action.
        JMenuItem disabledItem = new JMenuItem("I am Disabled");
        disabledItem.setEnabled(false);
        fileMenu.add(disabledItem);
        
        // An action to enable the disabled item
        JMenuItem enableItem = new JMenuItem("Enable Disabled Item");
        enableItem.addActionListener(e -> disabledItem.setEnabled(true));
        fileMenu.add(enableItem);
        
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q21::new);
    }
}
