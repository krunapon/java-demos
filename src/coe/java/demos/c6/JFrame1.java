package coe.java.demos.c6;
import javax.swing.*;
public class JFrame1 {
	public static void main(String[] args) {
		JFrame window = new JFrame("GUI Test");
		JPanel panel = new JPanel();
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");
		panel.add(submitButton);
		panel.add(cancelButton);
		window.add(panel);
		window.setVisible(true);
		window.setSize(200, 300);
		window.setLocationRelativeTo(null);
		window.pack();
	}
}
