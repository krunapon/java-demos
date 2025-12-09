package coe.java.demos.c6.y2020;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyWindow2 extends MyWindow implements 
        ActionListener {
    private class MyInnerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    public MyWindow2(String title) {
        super(title);
    }
    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }
    public void addListeners() {
        ButtonListener buttonListener =
        new ButtonListener();
        // anonymous inner class 
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
      //  okButton.addActionListener(new MyInnerListener());
       //  okButton.addActionListener(buttonListener);
       //  okButton.addActionListener(this);
    }
    public static void createAndShowGUI() {
        MyWindow2 window = new MyWindow2("GUI Handler");
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