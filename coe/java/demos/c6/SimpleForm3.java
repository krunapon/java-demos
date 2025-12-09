package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class SimpleForm3 extends SimpleForm1 {
	JPanel buttonsP;
	public SimpleForm3(String title) {
		// call the constructor of SimpleForm1
		super(title);
	}
	public void addComponents() {
		// call addComponents of SimpleForm1
		super.addComponents();
		JButton okB = new JButton("OK");
		JButton cancelB = new JButton("Cancel");
		buttonsP = new JPanel();
		buttonsP.add(okB);
		buttonsP.add(cancelB);
		contentP.add(buttonsP, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		// top-level container 
		SimpleForm3 window = 
				new SimpleForm3("Simple Form3");
		window.addComponents();
		window.setFrameFeatures();
	}
}
