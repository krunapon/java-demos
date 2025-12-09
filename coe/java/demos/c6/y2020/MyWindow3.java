package coe.java.demos.c6.y2020;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyWindow3 extends MyWindow2 implements 
        ActionListener {
    public MyWindow3(String title) {
        super(title);
    }
    public void actionPerformed(ActionEvent event) {
        Object srcObj = event.getSource();
        if (srcObj == okButton) {
            System.exit(0);
        } else if (srcObj == cancelButton) {
            JOptionPane.showMessageDialog(this, "You click");
        }
    }
    public void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }
    public static void createAndShowGUI() {
        MyWindow3 window = new MyWindow3("GUI Handler");
        window.addComponents();
        window.setFrameFeatures(); 
        window.addListeners();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}