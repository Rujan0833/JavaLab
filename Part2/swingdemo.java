package Part2;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class swingdemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Swing GUI");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(0,1,5,5)); // rows auto, 1 col, gap=5

        // Logo
        ImageIcon logo = new ImageIcon("bird_2.jpg"); 
        f.setIconImage(logo.getImage());

        // Components
        JLabel nameLabel = new JLabel("Rujan Rajlawat", JLabel.CENTER);
        JLabel iconLabel = new JLabel("Label with Icon", logo, JLabel.LEFT);

        JTextField tf = new JTextField(15);
        tf.setBorder(new LineBorder(Color.BLUE, 2));
        tf.setToolTipText("Enter text here");

        JTextArea ta = new JTextArea(3,15);
        JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JCheckBox cb = new JCheckBox("Check Me");
        JPasswordField pf = new JPasswordField(15);

        JRadioButton rb1 = new JRadioButton("Option 1");
        JRadioButton rb2 = new JRadioButton("Option 2");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2);

        JButton btn = new JButton("Click Me");
        JComboBox<String> combo = new JComboBox<>(new String[]{"Item1","Item2","Item3"});

        // Add to frame
        f.add(nameLabel); f.add(iconLabel);
        f.add(tf); f.add(sp);
        f.add(cb); f.add(pf);
        f.add(rb1); f.add(rb2);
        f.add(btn); f.add(combo);

        f.setVisible(true);
    }
}
