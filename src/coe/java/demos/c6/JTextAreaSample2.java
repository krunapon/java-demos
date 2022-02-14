package coe.java.demos.c6;
import javax.swing.*;
public class JTextAreaSample2 {
	public static void main(String[] args) {
		JFrame window = new JFrame("Text Area");
		// getContentPane() return Container
		// What's the relationship between JPanel and Container
		JPanel panel = (JPanel) window.getContentPane();
		// JPanel panel = new JPanel();
		JTextArea ta = new JTextArea(2,3);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(ta);
		ta.append("This is the course of Advanced Computer Programming");
		panel.add(scroll);
		// window.add(panel);
		window.pack();
		window.setLocation(100,100);
		window.setVisible(true);
	}

}
