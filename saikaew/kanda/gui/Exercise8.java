package saikaew.kanda.gui;

import javax.swing.*;
import java.awt.event.*;

public class Exercise8 extends Exercise7 implements ActionListener {
    public Exercise8(String title) {
        super(title);
    }

    public void enableMenuKeys() {
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        openMenuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_O, java.awt.Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    }

    public void addMenus() {
        super.addMenus();
        enableMenuKeys();
    }

    public void addListeners() {
        openMenuItem.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openMenuItem) {
            JOptionPane.showMessageDialog(this, "Open menu item clicked!");
        }
    }

    public static void createAndShowGUI() {
        Exercise8 frame = new Exercise8(myID);
        frame.addComponents(frame.getContentPane());
        frame.addMenus();
        frame.addListeners();
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}
