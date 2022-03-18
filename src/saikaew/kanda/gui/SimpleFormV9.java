package saikaew.kanda.gui;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class SimpleFormV9 extends SimpleFormV8 {
    protected JFileChooser fileChooser;
    public SimpleFormV9(String title) {
        super(title);
        fileChooser = new JFileChooser();
    }

    public void handleOpenMI() {
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //This is where a real application would open the file.
            JOptionPane.showMessageDialog(this,
                    "Opening: " + file.getName() + ".");
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this,
                    "Open command cancelled by user.");
        }
    }
    public void actionPerformed(ActionEvent e) {
        Object srcObject = e.getSource();
        if (srcObject == openMI) {
            handleOpenMI();
        } else {
            super.actionPerformed(e);
        }
    }
    public static void createAndShowGUI() {
        SimpleFormV9 window = new SimpleFormV9("SimpleFormV9");
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