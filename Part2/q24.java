package Part2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class q24 extends JFrame {

    public q24() {
        setTitle("File and Color Chooser");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        JButton fileChooserButton = new JButton("File Chooser");
        fileChooserButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            }
        });
        add(fileChooserButton);

        JButton colorChooserButton = new JButton("Color Chooser");
        colorChooserButton.addActionListener(e -> {
            java.awt.Color initialColor = java.awt.Color.BLACK;
            java.awt.Color selectedColor = JColorChooser.showDialog(this, "Choose a Color", initialColor);
            if (selectedColor != null) {
                System.out.println("Selected color: " + selectedColor.toString());
            }
        });
        add(colorChooserButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q24::new);
    }
}
