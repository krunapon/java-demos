package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JListDemoV2 extends JFrame {
	JPanel cp;
	String labels[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six",
		      "Seven", "Eight", "Nine", "Ten", "Eleven" };
	JList jlist;
	JScrollPane listPane;
	public JListDemoV2(String title) {
		// it will call the constructor of JFrame
		// and set the window title to the given 'title'
		super(title);
	}
	public void addComponents() {
		// cp is the content pane of JFrame
		cp = (JPanel) getContentPane();
		cp.setLayout(new BorderLayout());
		jlist = new JList(labels);
		jlist.setVisibleRowCount(13); 		// make 13 rows visible
		listPane = new JScrollPane(jlist);
		cp.add(listPane, BorderLayout.PAGE_START);
	}
	public void setFrameFeatures() {
		setVisible(true);
		pack();
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// create the object of this class
		JListDemoV2 list = new JListDemoV2("JList Demo");
		// add content
		list.addComponents();
		// make the frame visible
		list.setFrameFeatures();
	}
}
