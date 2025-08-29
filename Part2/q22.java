package Part2;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class q22 extends JFrame {

    private JProgressBar progressBar;

    public q22() {
        setTitle("Swing Components Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 1. JSlider with ChangeListener
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.addChangeListener(e -> {
            System.out.println("Slider value: " + slider.getValue());
            progressBar.setValue(slider.getValue());
        });
        add(new JLabel("Slider (Changes Progress Bar)"));
        add(slider);
        
        // 2. JList with ListSelectionListener
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Apple");
        listModel.addElement("Banana");
        listModel.addElement("Cherry");
        JList<String> list = new JList<>(listModel);
        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                System.out.println("Selected item: " + list.getSelectedValue());
            }
        });
        add(new JLabel("List (Select an Item)"));
        add(new JScrollPane(list));

        // 3. JTable
        String[] columnNames = {"Name", "Age"};
        Object[][] data = {{"John", 25}, {"Jane", 30}};
        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        add(new JLabel("Table"));
        add(new JScrollPane(table));

        // 4. JProgressBar (updated by the slider)
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        add(new JLabel("Progress Bar"));
        add(progressBar);

        // 5. JTree
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode nodeA = new DefaultMutableTreeNode("Node A");
        DefaultMutableTreeNode nodeB = new DefaultMutableTreeNode("Node B");
        top.add(nodeA);
        top.add(nodeB);
        JTree tree = new JTree(top);
        add(new JLabel("Tree"));
        add(new JScrollPane(tree));
        
        pack(); // Adjusts frame to fit components
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(q22::new);
    }
}
