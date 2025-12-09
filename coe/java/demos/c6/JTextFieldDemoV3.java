package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class JTextFieldDemoV3 
	extends JTextFieldDemoV2 {
	JLabel lastname, fullname;
	JTextField lastnameInput, fullnameTxt;
	JPanel fullnamePanel;
	JButton cancel;
	public JTextFieldDemoV3(String title) {
		super(title);
	}
	// override addButtons of JTextFieldDemoV2
	public void addButtons() {
		// calls addButtons method of
		// class JTextFieldDemoV2
		super.addButtons();
		// add cancel button
		cancel = new JButton("Cancel");
		buttons.add(cancel);
		add(buttons, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		JTextFieldDemoV3 window =
			new JTextFieldDemoV3("Names Form");
		window.addNames();
		window.addButtons();
		window.setFrameFeatures();
	}
	public void addNames() {
		// call addNames of JTextFieldDemoV2
		super.addNames();
		names.setLayout(new BorderLayout());
		JPanel flname = new JPanel(new GridLayout(2,2));
		lastname = new JLabel("Lastname:");
		lastnameInput = new JTextField(15);
		flname.add(name);
		flname.add(nameInput);
		flname.add(lastname);
		flname.add(lastnameInput);
		fullname = new JLabel("Your full name is:");
		fullnameTxt = new JTextField(30);
		// set the text field not editable by the user
		fullnameTxt.setEditable(false);
		fullnamePanel = new JPanel(new BorderLayout());
		fullnamePanel.add(fullname, BorderLayout.NORTH);
		fullnamePanel.add(fullnameTxt, BorderLayout.CENTER);
		names.add(flname, BorderLayout.NORTH);
		names.add(fullnamePanel, BorderLayout.CENTER);
	}
}
