package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCheckBoxV2 extends MyCheckBox implements
ActionListener {
   
    public MyCheckBoxV2(String title) {
        super(title);
    }
    public void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String result = "";
        Boolean know = false;
        if (source == okButton) {
            if (python.isSelected() == true) {
                result += python.getActionCommand() + " ";
                know = true;
            } 
            if (java.isSelected() == true) {
                result += java.getActionCommand() + " ";
                know = true;
            } 
            if (javascript.isSelected() == true) {
                result += java.getActionCommand() + " ";
                know = true;
            }
            if (know) {
                JOptionPane.showMessageDialog(this, 
                " You know " + result);
            } else {
                JOptionPane.showMessageDialog(this, " You don't know any language");
            }
        } else if (source == cancelButton) {
            python.setSelected(false);
            java.setSelected(false);
            javascript.setSelected(false);
        }
    }

  

    public static void main(String[] args) {
        MyCheckBoxV2 myCheckbox2 = new MyCheckBoxV2("My Checkbox V2");
        myCheckbox2.addComponents();
        myCheckbox2.setFrameFeatures(); 
        myCheckbox2.addListeners();

    }
}