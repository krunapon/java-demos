package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;
public class JTextFieldSample1 {
	public static void main(String[] args) {
		JFrame window = new JFrame("TextField Sample1");
		JLabel name = new JLabel("Name:");
		JTextField nameT = new JTextField("Manee",15);
		JLabel uni = new JLabel("University:");
		JTextField uniT = new JTextField();
		uniT.setEditable(false);
		// getContentPane() return Container
		JPanel container = (JPanel) window.getContentPane();
		JPanel nameP = new JPanel();
		JPanel uniP = new JPanel();
		nameP.add(name);
		nameP.add(nameT);
		uniP.add(uni);
		uniT.setText("KKU");
		uniP.add(uniT);
		container.setLayout(new GridLayout(2,1));
		container.add(nameP);
		container.add(uniP);
		window.pack();
		window.setLocation(100,200);
		window.setVisible(true);
		
		// get value of text field
		String curName = nameT.getText();
		System.out.println("cur name is " + curName);
	}
}
