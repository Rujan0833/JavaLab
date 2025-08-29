package Part2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q18 extends JFrame {

    private JTextField num1Field, num2Field;
    private JLabel resultLabel;
    private JButton addButton, subtractButton, multiplyButton;

    public q18() {
        setTitle("Simple Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("Serif", Font.BOLD, 16));
        
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");

        // Action listener using a lambda expression for conciseness
        ActionListener calculatorListener = e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = 0;

                JButton source = (JButton) e.getSource();
                String operator = source.getText();
                
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                }
                
                resultLabel.setText("Result: " + result);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        };

        addButton.addActionListener(calculatorListener);
        subtractButton.addActionListener(calculatorListener);
        multiplyButton.addActionListener(calculatorListener);

        add(new JLabel("Number 1:"));
        add(num1Field);
        add(new JLabel("Number 2:"));
        add(num2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(resultLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q18::new);
    }
}
