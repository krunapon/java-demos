package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxDemo22 extends JTextAreaDemo22 {
    protected JLabel languagesLabel;
    protected JPanel languagesPanel;
    protected JCheckBox pythonChkBox, javaChkBox, cSharpChkBox, dartChkBox;
    public JCheckBoxDemo22(String title) {
        super(title);
    }
    public void addComponents(Container contentPane) {
        contentPane.setLayout(new GridLayout(2,1));
        languagesLabel = new JLabel("Languages that you know well");
        languagesPanel = new JPanel();
        pythonChkBox = new JCheckBox("Python", true);
        javaChkBox = new JCheckBox("Java", true);
        cSharpChkBox = new JCheckBox("C#");
        dartChkBox = new JCheckBox("Dart");
        languagesPanel.add(pythonChkBox);
        languagesPanel.add(javaChkBox);
        languagesPanel.add(cSharpChkBox);
        languagesPanel.add(dartChkBox);
        contentPane.add(languagesLabel);
        contentPane.add(languagesPanel);
    }
    public static void createAndShowGUI() {
        JCheckBoxDemo22 window =  new JCheckBoxDemo22("JCheckBoxDemo");
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
