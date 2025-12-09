package coe.java.demos.c6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class JTextFieldDemoV4 
	extends JTextFieldDemoV3 
	implements ActionListener {
	public JTextFieldDemoV4(String title) {
		super(title);
	}
	public void addListeners() {
		submit.addActionListener(this);
		cancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		// getActionCommand() returns the button name
		String command = e.getActionCommand();
		// if (e.getSource().equals(submit)) {
		//if (command.equals("Submit")) {
		Object srcObj = e.getSource();
		if (srcObj == submit) {	
			fullnameTxt.setText(nameInput.getText() + " "
					+ lastnameInput.getText());
		} else if (srcObj == cancel) {
			fullnameTxt.setText("");
			nameInput.setText("");
			lastnameInput.setText("");
		}
	}
	public static void main(String[] args) {
		JTextFieldDemoV4 window =
			new JTextFieldDemoV4("Names Form");
		window.addNames();
		window.addButtons();
		window.addListeners();
		window.setFrameFeatures();
	}
}
