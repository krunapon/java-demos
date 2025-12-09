package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;

public class KKUStudent {

	public static void main(String[] args) {
		JFrame window = new JFrame("KKU Student");
		JPanel panel = new JPanel();
		JLabel name = new JLabel("Name:");
		JTextField nameT = new JTextField("Manee", 15);
		JLabel uni = new JLabel("Univ:");
		JTextField uniT = new JTextField("KKU", 20);
		uniT.setText("Khon Kaen University");
		uniT.setEditable(false);
		panel.setLayout(new BorderLayout());
		JPanel nameP = new JPanel();
		JPanel uniP = new JPanel();
		nameP.add(name);
		nameP.add(nameT);
		uniP.add(uni);
		uniP.add(uniT);
		panel.add(nameP, BorderLayout.NORTH);
		panel.add(uniP, BorderLayout.CENTER);
		window.add(panel);
		window.pack();
		window.setVisible(true);
		System.out.println(nameT.getText());
	}

}
