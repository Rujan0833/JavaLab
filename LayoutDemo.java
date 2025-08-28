import javax.swing.*;  
import java.awt.*;  

class LayoutDemo {  
    public static void main(String[] args) {  
        JFrame f=new JFrame("Layouts"); f.setSize(400,300); f.setDefaultCloseOperation(3);  

        // FlowLayout
        JPanel p1=new JPanel(new FlowLayout());  
        p1.add(new JButton("1")); p1.add(new JButton("2"));  
        f.add(p1); f.setVisible(true);  
        
        // BorderLayout
        JFrame f2=new JFrame("BorderLayout"); f2.setSize(400,300);  
        f2.setLayout(new BorderLayout());  
        f2.add(new JButton("N"),"North"); f2.add(new JButton("S"),"South");  
        f2.add(new JButton("E"),"East"); f2.add(new JButton("W"),"West");  
        f2.add(new JButton("C"),"Center"); f2.setVisible(true);  

        // GridLayout
        JFrame f3=new JFrame("GridLayout"); f3.setSize(300,200);  
        f3.setLayout(new GridLayout(2,2));  
        for(int i=1;i<=4;i++) f3.add(new JButton("B"+i));  
        f3.setVisible(true);  

        // GridBagLayout
        JFrame f4=new JFrame("GridBagLayout"); f4.setSize(300,200);  
        f4.setLayout(new GridBagLayout()); GridBagConstraints c=new GridBagConstraints();  
        f4.add(new JButton("X"),c); c.gridx=1; f4.add(new JButton("Y"),c);  
        f4.setVisible(true);  

        // GroupLayout
        JFrame f5=new JFrame("GroupLayout"); f5.setSize(300,200);  
        JPanel p5=new JPanel(); GroupLayout gl=new GroupLayout(p5); p5.setLayout(gl);  
        JButton b1=new JButton("A"), b2=new JButton("B");  
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(b1).addComponent(b2));  
        gl.setVerticalGroup(gl.createParallelGroup().addComponent(b1).addComponent(b2));  
        f5.add(p5); f5.setVisible(true);  
    }  
}
