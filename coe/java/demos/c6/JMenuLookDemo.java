package coe.java.demos.c6;

import javax.swing.*;
public class JMenuLookDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JMenuLookDemo");

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		menuBar.add(menu);

		JMenuItem menuItem = new JMenuItem("New");
		menu.add(menuItem);

		menuItem = new JMenuItem("Open", new ImageIcon(
				"images/openIcon.png"));
		menu.add(menuItem);

		// a group of radio button menu items
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		JRadioButtonMenuItem rb1 = 
			new JRadioButtonMenuItem("Java");
		rb1.setSelected(true);
		JRadioButtonMenuItem rb2 = 
			new JRadioButtonMenuItem("C++");
		group.add(rb1);
		group.add(rb2);
		menu.add(rb1);
		menu.add(rb2);
		// a submenu
		menu.addSeparator();
		JMenu submenu = new JMenu("Compile & Run");
		submenu.add(new JMenuItem("Compile"));
		submenu.add(new JMenuItem("Run"));
		menu.add(submenu);
		
		frame.setJMenuBar(menuBar);
		frame.setSize(500, 200);
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
