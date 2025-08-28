import javax.swing.*;
import java.awt.event.ActionEvent;

public class q23 extends JFrame {

    public q23() {
        setTitle("Toolbar & Dialog Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Create a toolbar and add it to the frame
        JToolBar toolBar = new JToolBar("My Toolbar");
        add(toolBar, "North"); // Add toolbar to the top of the frame

        // Button to show a modal dialog
        JButton modalButton = new JButton("Modal Dialog");
        modalButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "This is a modal dialog. You can't interact with the main window.", "Modal Dialog", JOptionPane.INFORMATION_MESSAGE);
        });
        toolBar.add(modalButton);

        // Button to show a modeless dialog
        JButton modelessButton = new JButton("Modeless Dialog");
        modelessButton.addActionListener(e -> {
            JDialog modelessDialog = new JDialog(this, "Modeless Dialog", false); // 'false' makes it modeless
            modelessDialog.setSize(200, 100);
            modelessDialog.add(new JLabel("This is a modeless dialog. You can still click the main window."));
            modelessDialog.setLocationRelativeTo(this);
            modelessDialog.setVisible(true);
        });
        toolBar.add(modelessButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q23::new);
    }
}
