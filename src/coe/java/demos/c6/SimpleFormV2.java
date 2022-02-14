package coe.java.demos.c6;
import java.awt.event.*; // For ActionListener, ...
public class SimpleFormV2 extends SimpleFormV1 
	implements ActionListener {
	public SimpleFormV2(String title) {
		super(title);
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Exit"))
			System.exit(0);
	}
	public void addListeners() {
		exit.addActionListener(this);
	}
	public static void main(String[] args) {
		SimpleFormV2 sf = new SimpleFormV2("A Simple Form");
		sf.addButtons();
		sf.setFrameFeatures();
		sf.addListeners();
	}
}
