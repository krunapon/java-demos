package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComponentEventDemo extends JPanel
                 implements ComponentListener,ItemListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame frame;
    JTextArea display;
    JLabel label;
    String newline = "\n";
    public ComponentEventDemo() {
        super(new BorderLayout());
        display = new JTextArea();
        display.setFont(new Font("Serif", Font.BOLD, 18));
        display.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(display);
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
    protected void displayMessage(String message) {
	    display.append(message + newline);
        display.setCaretPosition(display.getDocument().getLength());
  
    }
    public void componentHidden(ComponentEvent e) {
        displayMessage(e.getComponent().getClass().getName() + " --- Hidden");
    }
    public void componentMoved(ComponentEvent e) {
        displayMessage(e.getComponent().getClass().getName() + " --- Moved");
    }
    public void componentResized(ComponentEvent e) {
        displayMessage(e.getComponent().getClass().getName() + " --- Resized ");            
    }
    public void componentShown(ComponentEvent e) {
        displayMessage(e.getComponent().getClass().getName() + " --- Shown");

    }


    public static void main(String[] args) {
        //Create and set up the window.
        frame = new JFrame("ComponentEventDemo");
        
        //Create and set up the content pane.
        JComponent newContentPane = new ComponentEventDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
      //  frame.addComponentListener((ComponentEventDemo) newContentPane);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

} 

