package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class JComboBoxDemo22 extends JTextAreaDemo22 {
    protected JLabel colorLabel;
    protected JComboBox<String> colorsCb;

    public JComboBoxDemo22(String title) {
        super(title);
    }

    public void addComponents(Container contentPane) {
        contentPane.setLayout(new GridLayout(2,1));
        colorLabel = new JLabel("Which color that you like?");
        colorsCb = new JComboBox<String>();
        colorsCb.addItem("Red");
        colorsCb.addItem("Green");
        colorsCb.addItem("Blue");
        colorsCb.setEditable(true);
        contentPane.add(colorLabel);
        contentPane.add(colorsCb);
    }
    public static void createAndShowGUI() {
        JComboBoxDemo22 window =  new JComboBoxDemo22("JRadioButtonDemo");
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