package coe.java.demos.c6;

import javax.swing.*;

public class JMenuLookDemo22 extends JTextAreaDemo22{
    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenuItem newMI, openMI;

    public JMenuLookDemo22(String title) {
        super(title);
    }

    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMI = new JMenuItem("New");
        openMI = new JMenuItem("Open");
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
    }

    public static void createAndShowGUI() {
        JMenuLookDemo22 window =  new JMenuLookDemo22("JMenuLookDemo");
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
