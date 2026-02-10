package saikaew.kanda.gui;

import javax.swing.*;

public class Exercise7 extends Exercise6 {
    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenuItem newMenuItem, openMenuItem, quitMenuItem;

    public Exercise7(String title) {
        super(title);
    }

    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open", new ImageIcon("images/openIcon.png"));
        quitMenuItem = new JMenuItem("Quit");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(quitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    public static void createAndShowGUI() {
        Exercise7 frame = new Exercise7(myID);
        frame.addComponents(frame.getContentPane());
        frame.addMenus();
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

}
