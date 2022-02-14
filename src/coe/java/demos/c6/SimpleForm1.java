package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class SimpleForm1 extends JFrame {
	JLabel nameL;
	JTextField nameT;
	JPanel nameP;
	JPanel contentP;
	public SimpleForm1(String title) {
		// call the constructor of JFrame 
		super(title);
	}
	public void addComponents() {
		nameL = new JLabel("Name:");
		nameT = new JTextField(15);
		// intermediate container 
		contentP = (JPanel) getContentPane();
		contentP.setLayout(new BorderLayout());
		nameP = new JPanel();
		nameP.setLayout(new FlowLayout());
		nameP.add(nameL);
		nameP.add(nameT);
		contentP.add(nameP, BorderLayout.NORTH);
	}
	public void setFrameFeatures() {
		setVisible(true);
		// automatically compute the sizes of the component
		// pack the components to fit within the window
		pack();
		// have the program exit when the window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// top-level container 
		SimpleForm1 window = 
				new SimpleForm1("Simple Form");
		window.addComponents();
		window.setFrameFeatures();
	}
}
