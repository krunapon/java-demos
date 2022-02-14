package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class SimpleForm extends JFrame {
	// If we declare the variable inside
	// the method, then the subclass cannot
	// see it 
	JButton exit;
	JPanel content;
	public SimpleForm(String title) {
		// call constructor of JFrame
		// which sets the frame title
		super(title);
	}
	public void addButton() {
		exit = new JButton("Exit");
		// call getContentPane() method
		// of class JFrame
		content = (JPanel) getContentPane();
		content.setLayout(new FlowLayout());
		content.add(exit);
	}
	public void setFrameFeatures() {
		pack();
		setVisible(true);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SimpleForm sf = 
			new SimpleForm("A Very Simple Form");
		sf.addButton();
		sf.setFrameFeatures();
	}
}
