package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComponentEventDemo extends JPanel
                 implements ComponentListener,ItemListener {
	static JFrame frame;
    JTextArea displayTxtArea;
    JLabel label;
    String newline = "\n";
    public ComponentEventDemo() {
        super(new BorderLayout());
        displayTxtArea = new JTextArea();
        displayTxtArea.setFont(new Font("Serif", Font.BOLD, 18));
        displayTxtArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayTxtArea);
        scrollPane.setPreferredSize(new Dimension(350, 200));
        JPanel panel = new JPanel(new BorderLayout());
        label = new JLabel("This is a label", JLabel.CENTER);
        label.addComponentListener(this);
        panel.add(label, BorderLayout.CENTER); 
        JCheckBox checkbox = new JCheckBox("Label visible", true);
        checkbox.addItemListener(this);
        checkbox.addComponentListener(this);
        panel.add(checkbox, BorderLayout.PAGE_END); // SOUTH
        panel.addComponentListener(this);
        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.PAGE_END); // SOUTH
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setVisible(true);
            label.revalidate();
            label.repaint();
        } else {
            label.setVisible(false);
        }
    }
    protected void displayTxtAreaMessage(String message) {
	    displayTxtArea.append(message + newline);
        displayTxtArea.setCaretPosition(displayTxtArea.getDocument().getLength());
    }
    public void componentHidden(ComponentEvent e) {
        displayTxtAreaMessage(e.getComponent().getClass().getName() + " --- Hidden");
    }
    public void componentMoved(ComponentEvent e) {
        displayTxtAreaMessage(e.getComponent().getClass().getName() + " --- Moved");
    }
    public void componentResized(ComponentEvent e) {
        displayTxtAreaMessage(e.getComponent().getClass().getName() + " --- Resized ");            
    }
    public void componentShown(ComponentEvent e) {
        displayTxtAreaMessage(e.getComponent().getClass().getName() + " --- Shown");

    }

    public static void main(String[] args) {
        //Create and set up the window.
        frame = new JFrame("ComponentEventDemo");
        
        //Create and set up the content pane.
        JComponent newContentPane = new ComponentEventDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}