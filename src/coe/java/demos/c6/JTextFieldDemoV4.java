package coe.java.demos.c6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class JTextFieldDemoV4 extends JTextFieldDemoV3 implements ActionListener {
	public JTextFieldDemoV4(String title) {
		super(title);
	}
	public void addListeners() {
		submitButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); // command is button name
		// if (e.getSource().equals(submit)) { or if (command.equals("Submit")) {
		Object srcObj = e.getSource();
		if (srcObj == submitButton) {
			fullnameTxtField.setText(nameInputTxtField.getText() + " "
					+ lastnameInputTxtField.getText());
		} else if (srcObj == cancelButton) {
			fullnameTxtField.setText("");
			nameInputTxtField.setText("");
			lastnameInputTxtField.setText("");
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
