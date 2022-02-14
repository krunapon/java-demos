package coe.java.demos.c6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// listener class 
class ButtonHandler2 implements ActionListener {
	// this method is executed when the event occurs
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
public class MyFirstListener extends JFrame {
	JButton closeButton;
	
	public MyFirstListener(String title) {
		super(title);
		closeButton = new JButton("Close window");
		add(closeButton);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
	}
	
	public void addListeners() {
		// listener is a listener object 
		ButtonHandler2 listener = new ButtonHandler2();
		// source object is closeButton
		// need to register the listener with the source object
		closeButton.addActionListener(listener);
	}
	public static void main(String[] args) {
		MyFirstListener myfl = new MyFirstListener("First Listener");
		myfl.addListeners();
	}

}
