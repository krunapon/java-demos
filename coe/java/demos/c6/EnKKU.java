package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class EnKKU {
	public static void main(String[] args) {
		JFrame window = new JFrame("En KKU");
		JButton coe = new JButton("COE");
		JButton me = new JButton("MechE");
		JButton ee = new JButton("EE");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(coe, BorderLayout.NORTH);
		panel.add(me, BorderLayout.CENTER);
		panel.add(ee, BorderLayout.SOUTH);
		window.add(panel);
		window.pack();
		Dimension dim =
			Toolkit.getDefaultToolkit().getScreenSize();
		int width = dim.width;
		int height = dim.height;
		int w = window.getSize().width;
		int h = window.getSize().height;
		int x = (width - w)/2;
		int y = (height - h)/2;
		window.setLocation(x,y);
		window.setVisible(true);
	}
}
