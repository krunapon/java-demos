package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.*;

public class MyCheckBox extends MyWindow {
    JCheckBox checkboxes;
    JPanel overallPanel, checkboxesPanel;
    JLabel label;
    JCheckBox python, java, javascript;
    final static int NUM_ROWS = 5;
    final static int NUM_COLS = 20;
    public MyCheckBox(String title) {
        super(title);
    }
    public void addComponents() {
        super.addComponents();
        label = new JLabel("Languages that you know well");
        checkboxesPanel = new JPanel();
        python = new JCheckBox("Python", true);
        java = new JCheckBox("java", true);
        javascript = new JCheckBox("javascript");
        checkboxesPanel.add(python);
        checkboxesPanel.add(java);
        checkboxesPanel.add(javascript);
        overallPanel = new JPanel();
        overallPanel.setLayout(new GridLayout(3,1));
        overallPanel.add(label);
        overallPanel.add(checkboxesPanel);
        overallPanel.add(buttonsPanel);
        this.setContentPane(overallPanel);
    }
    public static void main(String[] args) {
        MyCheckBox myCheckbox = new MyCheckBox("My Checkbox");
        myCheckbox.addComponents();
        myCheckbox.setFrameFeatures(); 
    }
}