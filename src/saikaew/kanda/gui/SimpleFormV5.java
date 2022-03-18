package saikaew.kanda.gui;
import javax.swing.*;
import java.awt.event.*;

public class SimpleFormV5 extends SimpleFormV4
        implements ActionListener  {
    protected String name, addr;
    public SimpleFormV5(String name) {
        super(name);
    }
    public void addListeners() {
        okButton.addActionListener(this);
    }
    protected void handleSubmitButtonClick() {
        name = nameTxt.getText();
        addr = addrTxtArea.getText();
    }
    public void actionPerformed(ActionEvent e) {
        Object srcObject = e.getSource();
        if (srcObject == okButton) {
            handleSubmitButtonClick();
            JOptionPane.showMessageDialog(this, name + " lives at " + addr);
        }
    }
    public static void createAndShowGUI() {
        SimpleFormV5 window = new SimpleFormV5("SimpleFormV5");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}