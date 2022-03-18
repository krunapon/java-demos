package coe.java.demos.c6;

import javax.swing.*;

public class JMenuLookDemo22V2 extends JMenuLookDemo22 {
    protected JRadioButtonMenuItem javaRBMI, pythonRBMI;
    protected ButtonGroup languagesBG;
    protected JMenu compileRunMenu;
    protected JMenuItem compileMI, runMI;
    public JMenuLookDemo22V2(String title) {
        super(title);
    }

    public void addIcon() {
        ImageIcon openIcon = new ImageIcon("images/openIcon.png");
        fileMenu.remove(openMI);
        openMI = new JMenuItem("Open", openIcon);
        fileMenu.add(openMI);
    }

    public void addRadioMIGroup() {
        javaRBMI = new JRadioButtonMenuItem("Java");
        pythonRBMI = new JRadioButtonMenuItem("Python");
        fileMenu.add(javaRBMI);
        fileMenu.add(pythonRBMI);
        languagesBG = new ButtonGroup();
        languagesBG.add(javaRBMI);
        languagesBG.add(pythonRBMI);
    }

    public void addCompileRunSubMenus() {
        compileRunMenu = new JMenu("Compile & Run");
        compileMI = new JMenuItem("Compile");
        runMI = new JMenuItem("Run");
        compileRunMenu.add(compileMI);
        compileRunMenu.add(runMI);
        fileMenu.add(compileRunMenu);
    }

    @Override
    public void addMenus() {
        super.addMenus();
        addIcon();
        fileMenu.addSeparator();
        addRadioMIGroup();
        fileMenu.addSeparator();
        addCompileRunSubMenus();
    }
    public static void createAndShowGUI() {
        JMenuLookDemo22V2 window =  new JMenuLookDemo22V2("JMenuLookDemo V2");
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
