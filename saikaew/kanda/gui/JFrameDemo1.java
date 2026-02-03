import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame{

    protected JButton okButton, cancelButton;
    protected JPanel mainPanel;

    public MySimpleWindow(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        mainPanel = new JPanel();
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        mainPanel.add(cancelButton);
        mainPanel.add(okButton);
        add(mainPanel);
    }

    protected void setFrameFeatures() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}