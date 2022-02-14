import javax.swing.*;
import java.awt.*;

public class JFrame1 extends JFrame {
    public JFrame1() {
        super("GUI Test");
    }

    public void addComponents() {
        JLabel actionLabel = new JLabel("Action:");
        JPanel buttonsPanel = (JPanel) this.getContentPane();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(actionLabel);
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);
    }

    public void setFrameFeatures() {
        //  window.add(buttonsPanel);
        //  window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame1 window = new JFrame1();
        window.addComponents();
        window.setFrameFeatures();
    }
}
