package coe.java.demos.c6;
import java.awt.event.*;
public class SimpleForm2 extends SimpleForm 
	implements ActionListener {
	public SimpleForm2(String title) {
		super(title);
	}
	public void addListeners() {
		exit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Exit")) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		SimpleForm2 sf2 = 
			new SimpleForm2("A Very Simple Form");
		sf2.addButton();
		sf2.setFrameFeatures();
		sf2.addListeners();
	}
}
