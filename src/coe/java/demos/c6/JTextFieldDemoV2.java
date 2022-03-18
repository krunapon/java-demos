package coe.java.demos.c6;
import java.awt.*;
import javax.swing.*;
public class JTextFieldDemoV2 extends JFrame {
	protected JPanel namesPanel, buttonsPanel;
	protected JLabel nameLabel;
	protected JTextField nameInputTxtField;
	protected JButton submitButton;
	public JTextFieldDemoV2(String title) {
		super(title);
	}

	public void addNames() {
		setLayout(new BorderLayout());
		namesPanel = new JPanel();
		nameLabel = new JLabel("Firstname:");
		nameLabel.setPreferredSize(
				new Dimension(100,50));
		nameInputTxtField = new JTextField(15);
		nameInputTxtField.setToolTipText("Input your firstname");
		namesPanel.add(nameLabel);
		namesPanel.add(nameInputTxtField);
		add(namesPanel, BorderLayout.NORTH);
	}
	public void addButtons() {
		buttonsPanel = new JPanel();
		submitButton = new JButton("Submit");
		buttonsPanel.add(submitButton);
		add(buttonsPanel, BorderLayout.CENTER);
	}
	public void setFrameFeatures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// create the object of JTextFieldDemoV2
		JTextFieldDemoV2 window =
			new JTextFieldDemoV2("Names Form");
		window.addNames();
		window.addButtons();
		window.setFrameFeatures();
	}
}
