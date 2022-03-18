package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo22 extends JTextAreaDemo22 {
    protected JLabel gradeLabel;
    protected JPanel gradesPanel;
    protected JRadioButton gradeARb, gradeBRb, gradeCRb, gradeDRb;
    protected ButtonGroup gradesBg;
    public JRadioButtonDemo22(String title) {
        super(title);
    }
    public void addComponents(Container contentPane) {
        contentPane.setLayout(new GridLayout(2,1));
        gradeLabel = new JLabel("A grade that you hope to get");
        gradesPanel = new JPanel();
        gradesBg = new ButtonGroup();
        gradeARb = new JRadioButton("A");
        gradeBRb = new JRadioButton("B", true);
        gradeCRb = new JRadioButton("C", true);
        gradeDRb = new JRadioButton("D");
        gradesPanel.add(gradeARb);
        gradesPanel.add(gradeBRb);
        gradesPanel.add(gradeCRb);
        gradesPanel.add(gradeDRb);
        gradesBg.add(gradeARb);
        gradesBg.add(gradeBRb);
        gradesBg.add(gradeCRb);
        gradesBg.add(gradeDRb);
        contentPane.add(gradeLabel);
        contentPane.add(gradesPanel);
    }
    public static void createAndShowGUI() {
        JRadioButtonDemo22 window =  new JRadioButtonDemo22("JRadioButtonDemo");
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
