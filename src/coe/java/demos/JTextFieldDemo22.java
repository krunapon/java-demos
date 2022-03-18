package coe.java.demos;

import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo22 extends JFrame {
    protected JTextField nameTxtField;
    protected JLabel nameLabel;
    protected JPanel namePanel, buttonsPanel;
    protected JButton submitButton;

    public JTextFieldDemo22(String title) {
        super(title);
    }

    public void setFrameFeatures() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void addComponents(Container contentPane) {
        nameTxtField = new JTextField("Manee");
        nameLabel = new JLabel("Name:");
        namePanel = new JPanel();
        buttonsPanel = new JPanel();
        submitButton = new JButton("Submit");
        namePanel.add(nameLabel);
        namePanel.add(nameTxtField);
        buttonsPanel.add(submitButton);
        contentPane.setLayout(new BorderLayout());
        contentPane.add(namePanel, BorderLayout.NORTH);
        contentPane.add(buttonsPanel, BorderLayout.SOUTH);
    }

    public static void createAndShowGUI() {
        JTextFieldDemo22 window =  new JTextFieldDemo22("JTextFieldDemo");
        JPanel panel = new JPanel(); // 2.1, 3.1)
        window.addComponents(panel);
        window.add(panel);
        window.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}