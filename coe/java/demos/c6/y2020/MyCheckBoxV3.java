package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCheckBoxV3 extends MyCheckBoxV2 implements
ActionListener, ItemListener {
   
    public MyCheckBoxV3(String title) {
        super(title);
    }
    public void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
        python.addItemListener(this);
        javascript.addItemListener(this);
        java.addItemListener(this);
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
        MyCheckBoxV3 myCheckbox3 = new MyCheckBoxV3("My Checkbox V3");
        myCheckbox3.addComponents();
        myCheckbox3.setFrameFeatures(); 
        myCheckbox3.addListeners();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
     //   JCheckBox srcItem = (JCheckBox) e.getItemSelectable();
          JCheckBox srcObject = (JCheckBox) e.getSource();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(this, 
                "You know well about " + srcObject.getActionCommand());
        } else {
            JOptionPane.showMessageDialog(this, 
            "You don't know well about " + srcObject.getActionCommand());
        }
        

    }
}