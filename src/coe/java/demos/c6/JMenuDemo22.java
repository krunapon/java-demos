package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;
public class JMenuDemo22 extends JTextAreaDemo22 {
    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenuItem quitMenuItem;

    public JMenuDemo22(String title) {
        super(title);
    }

    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        ImageIcon quitImgIcon = new ImageIcon("images/quit.png");
        quitMenuItem = new JMenuItem("Quit", quitImgIcon);
        menuBar.add(fileMenu);
        fileMenu.add(quitMenuItem);
        this.setJMenuBar(menuBar);
    }
    public static void createAndShowGUI() {
        JMenuDemo22 window =  new JMenuDemo22("JMenuDemo");
        JPanel panel = new JPanel(); // 2.1, 3.1)
        window.addComponents(panel);
        window.add(panel);
        window.addMenus();
        window.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
