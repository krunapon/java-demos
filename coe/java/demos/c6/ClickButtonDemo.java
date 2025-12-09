package coe.java.demos.c6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// listener class
class ButtonHandler implements
ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
public class ClickButtonDemo extends JFrame {
	JButton okButton;
	ClickButtonDemo(String title) {
		super(title);
		JPanel content = (JPanel) getContentPane();
		okButton = new JButton("Close Window");
		content.add(okButton);
	}
	
	public void addListeners() {
		// create listener object
		ButtonHandler listener =
			new ButtonHandler();
		// register the listener
		okButton.addActionListener(listener);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClickButtonDemo cbd =
			new ClickButtonDemo("Button Demo");
		cbd.addListeners();	
		cbd.setVisible(true);
		cbd.pack();
		cbd.setLocation(200,200);
		
	}

}
