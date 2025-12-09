package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class MyForm {
	public static void addComponents(Container c) {
		JPanel name = new JPanel(new FlowLayout());
		JPanel univ = new JPanel(new FlowLayout());
		JPanel buttons = new JPanel(new FlowLayout());
		c.setLayout(new BorderLayout());
		name.add(new JLabel("Name:"));
		name.add(new JTextField("Manee ", 15));
		univ.add(new JLabel("University:"));
		univ.add(new JTextField("KKU  ", 20));
		buttons.add(new JButton("Submit"));
		buttons.add(new JButton("Cancel"));
		c.add(name, BorderLayout.NORTH);
		c.add(univ, BorderLayout.CENTER);
		c.add(buttons, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		JFrame myForm = new JFrame("My Form");
		addComponents(myForm.getContentPane());
		myForm.setLocation(100,100);
		myForm.pack();
		myForm.setVisible(true);
	}

}
