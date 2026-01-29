package saikaew.kanda.gui;
import javax.swing.*;
public class JFrameDemo1 {
    public static void main(String[] args) {
        JFrame window = new JFrame("My Window");
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);
        window.setContentPane(buttonsPanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}