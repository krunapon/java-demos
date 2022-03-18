package saikaew.kanda.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFormV7 extends SimpleFormV6 {
    public SimpleFormV7(String title) {
        super(title);
    }

    public void addListeners() {
        super.addListeners();
        newMI.addActionListener(this);
        openMI.addActionListener(this);
        quitMI.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object srcObj = e.getSource();
        if (srcObj == newMI) {
            JOptionPane.showMessageDialog(this, "Menu New is clicked");
        } else if (srcObj == openMI) {
            JOptionPane.showMessageDialog(this, "Menu Open is clicked");
        } else if (srcObj == quitMI) {
            System.exit(0);
        }
    }
    public void addMenus() {
        super.addMenus();
        newMI.setMnemonic(KeyEvent.VK_N);
        openMI.setMnemonic(KeyEvent.VK_O);
        quitMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    }
    public static void createAndShowGUI() {
        SimpleFormV7 window = new SimpleFormV7("SimpleFormV7");
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