package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JTextAreaDemo {
	public static void addComponents(Container cp) {
		cp.setLayout(new FlowLayout());
		// text area with 4 rows and 20 columns
		JTextArea news = new JTextArea(4, 20);
		//news.setLineWrap(true);
		//news.setWrapStyleWord(true);
		news.setText("A leading academic Monday urged Cabinet "); 
		news.append("members to intervene in the decision of ");
		news.append("universities to increase the number of ");
		news.append("Professional Aptitude Tests (PATs).");
		JScrollPane sp = new JScrollPane(news);
		cp.add(sp);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("JTextAreaDemo");
		addComponents(frame.getContentPane());
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
