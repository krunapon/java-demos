package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.event.*;

public class TestMenuV2 extends TestMenu implements ActionListener {
    public TestMenuV2(String title) {
        super(title);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem srcMI = (JMenuItem) e.getSource();
        JOptionPane.showMessageDialog(this, "You click menu " + srcMI.getActionCommand());
    }
    public void enableKeyboard() {
        newMI.setMnemonic(KeyEvent.VK_N);
        newMI.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_N, ActionEvent.CTRL_MASK));

    }
    public void addListeners() {
        newMI.addActionListener(this);
        copyMI.addActionListener(this);
        pasteMI.addActionListener(this);
    }
    public static void main(String[] args) {
        TestMenuV2 myWindow = new TestMenuV2("Test Menu V2");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.enableKeyboard();
        myWindow.setFrameFeatures();
        myWindow.addListeners();

    }
}