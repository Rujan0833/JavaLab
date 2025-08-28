import javax.swing.*; import javax.swing.border.*; import java.awt.*;
class SwingDemo2{
  public static void main(String[] a){
    JFrame f=new JFrame("My Swing GUI");
    f.setSize(500,500); f.setDefaultCloseOperation(3);
    f.setLayout(new GridLayout(0,1,5,5));
    ImageIcon logo=new ImageIcon("bird_2.jpg    "); f.setIconImage(logo.getImage());

    JTextField tf=new JTextField(); tf.setBorder(new LineBorder(Color.BLUE,2)); tf.setToolTipText("Enter text");
    JTextArea ta=new JTextArea(); JScrollPane sp=new JScrollPane(ta,20,30);
    JRadioButton r1=new JRadioButton("Option1"),r2=new JRadioButton("Option2"); new ButtonGroup().add(r1); new ButtonGroup().add(r2);

    f.add(new JLabel("Rujan Rajlawat",JLabel.CENTER));
    f.add(new JLabel("Label with Icon",logo,JLabel.LEFT));
    f.add(tf); f.add(sp); f.add(new JCheckBox("Check Me")); f.add(new JPasswordField());
    f.add(r1); f.add(r2); f.add(new JButton("Click Me"));
    f.add(new JComboBox<>(new String[]{"Item1","Item2","Item3"}));
    f.setVisible(true);
  }
}