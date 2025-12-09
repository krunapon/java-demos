package coe.java.demos.c6.y2020;
import javax.swing.*;
public class TestMenu extends MyWindow {
    JMenuBar menuBar;
    JMenu fileMenu, editMenu;
    JMenuItem newMI, copyMI, pasteMI;
    public TestMenu(String title) {
        super(title);
    }
    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMI = new JMenuItem("New", new ImageIcon("images/new.jpg"));
        editMenu = new JMenu("Edit");
        copyMI = new JMenuItem("Copy");
        pasteMI = new JMenuItem("Paste");
        fileMenu.add(newMI);
        editMenu.add(copyMI);
        editMenu.add(pasteMI);
        fileMenu.add(editMenu);
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
    }
    public static void main(String[] args) {
        TestMenu myWindow = new TestMenu("Test Menu");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.setFrameFeatures();

    }
}