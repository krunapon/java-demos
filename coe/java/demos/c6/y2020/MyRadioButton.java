import javax.swing.*;
import java.awt.*;

public class MyRadioButton extends MyWindow {
    JCheckBox checkboxes;
    JPanel overallPanel, gradesPanel;
    JLabel label;
    JRadioButton a, b, c, d;
    ButtonGroup grades;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem newMenuItem;

    public MyRadioButton(String title) {
        super(title);
    }
    public void addComponents() {
        super.addComponents();
        label = new JLabel("A grade that a student who works hard will get");
        gradesPanel = new JPanel();
        a = new JRadioButton("A", true);
        b = new JRadioButton("B");
        c = new JRadioButton("C");
        d = new JRadioButton("D");
        grades = new ButtonGroup();
        grades.add(a);
        grades.add(b);
        grades.add(c);
        grades.add(d);
        gradesPanel.add(a);
        gradesPanel.add(b);
        gradesPanel.add(c);
        gradesPanel.add(d);
        overallPanel = new JPanel();
        overallPanel.setLayout(new GridLayout(3,1));
        overallPanel.add(label);
        overallPanel.add(gradesPanel);
        overallPanel.add(buttonsPanel);
        this.setContentPane(overallPanel);
    }
    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New");
        menuBar.add(fileMenu);
        fileMenu.add(newMenuItem);
        this.setJMenuBar(menuBar);
    }
    public static void main(String[] args) {
        MyRadioButton myrb = new MyRadioButton("My Radio Buttons");
        myrb.addComponents();
        myrb.addMenus();
        myrb.setFrameFeatures(); 
    }
}