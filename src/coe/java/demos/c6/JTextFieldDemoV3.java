package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class JTextFieldDemoV3 extends JTextFieldDemoV2 {
	protected JLabel lastnameLabel, fullnameLabel;
	protected JTextField lastnameInputTxtField, fullnameTxtField;
	protected JPanel fullnamePanel, firstnamePanel, lastnamePanel, mainPanel;
	protected JButton cancelButton;

	public JTextFieldDemoV3(String title) {
		super(title);
	}

	// override addButtons of JTextFieldDemoV2
	public void addButtons() {
		// calls addButtons method of class JTextFieldDemoV2
		super.addButtons();
		cancelButton = new JButton("Cancel");
		buttonsPanel.add(cancelButton);
	}

	public void addComponents() {
		mainPanel = new JPanel(new BorderLayout());
		addNames();
		mainPanel.add(namesPanel, BorderLayout.NORTH);
		addButtons();
		mainPanel.add(buttonsPanel, BorderLayout.CENTER);
		this.setContentPane(mainPanel);
	}

	public static void main(String[] args) {
		JTextFieldDemoV3 window =
			new JTextFieldDemoV3("Names Form");
		window.addComponents();
		window.setFrameFeatures();
	}

	public void addNames() {
		// call addNames of JTextFieldDemoV2
		super.addNames();
		namesPanel.setLayout(new BorderLayout());
		JPanel flnamePanel = new JPanel(new BorderLayout());

		lastnameLabel = new JLabel("Lastname:");
		lastnameLabel.setPreferredSize(
				new Dimension(100,50));
		lastnameInputTxtField = new JTextField(15);

		firstnamePanel = new JPanel();
		firstnamePanel.add(nameLabel);
		firstnamePanel.add(nameInputTxtField);

		lastnamePanel = new JPanel();
		lastnamePanel.add(lastnameLabel);
		lastnamePanel.add(lastnameInputTxtField);

		flnamePanel.add(firstnamePanel, BorderLayout.NORTH);
		flnamePanel.add(lastnamePanel, BorderLayout.SOUTH);

		fullnameLabel = new JLabel("Your full name is:");
		fullnameTxtField = new JTextField(30);
		// set the text field not editable by the user
		fullnameTxtField.setEditable(false);

		fullnamePanel = new JPanel(new BorderLayout());
		fullnamePanel.add(fullnameLabel, BorderLayout.NORTH);
		fullnamePanel.add(fullnameTxtField, BorderLayout.CENTER);

		namesPanel.add(flnamePanel, BorderLayout.NORTH);
		namesPanel.add(fullnamePanel, BorderLayout.CENTER);
	}
}
