package coe.java.demos.c6;

import javax.swing.*;
public class JMenuLookDemoV2 extends JFrame {
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenuItem newMI, openMI, saveMI, exitMI;
	ButtonGroup buttonGroup;
	JRadioButtonMenuItem javaRBMI, pythonRBMI;
	public JMenuLookDemoV2(String title) {
		super(title);
	}
	public void setFrameFeatures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		JMenuLookDemoV2 window = new JMenuLookDemoV2("JMenuLookDemoV2 Demo");
		window.addMenus();
		window.setFrameFeatures();
	}
	
	public void addMenus() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		menuBar.add(fileMenu);

		newMI = new JMenuItem("New");
		fileMenu.add(newMI);
		openMI = new JMenuItem("Open", new ImageIcon(
				"images/openIcon.png"));
		fileMenu.add(openMI);

		fileMenu.addSeparator();
		buttonGroup = new ButtonGroup();
		javaRBMI =  new JRadioButtonMenuItem("Java");
		pythonRBMI = new JRadioButtonMenuItem("Python");
		buttonGroup.add(javaRBMI);
		javaRBMI.setSelected(true);
		buttonGroup.add(pythonRBMI);
		fileMenu.add(javaRBMI);
		fileMenu.add(pythonRBMI);
		fileMenu.addSeparator();
	
		saveMI = new JMenuItem("Save", new ImageIcon("images/saveIcon.png"));
		fileMenu.add(saveMI);
		exitMI = new JMenuItem("Exit");
		fileMenu.add(exitMI);
		setJMenuBar(menuBar);
	}

}
