package coe.java.demos.c6;
import java.awt.*;
import javax.swing.*;
public class JTextFieldDemoV2 extends JFrame {
	JPanel names, buttons;
	JLabel name;
	JTextField nameInput;
	JButton submit;
	public JTextFieldDemoV2() {
		// calls the constructor of JFrame
		// which sets title of the window to
		// "Simple Form" 
		super("Simple Form");
	}
	public JTextFieldDemoV2(String title) {
		// calls the constructor of JFrame
		// which sets title of the window to
		// title
		super(title);
	}
	// make it instance method so that
	// other instance methods can call it
	// does not have keyword static
	public void addNames() {
		setLayout(new BorderLayout());
		names = new JPanel();
		name = new JLabel("Firstname:");
		// the first parameter of Dimension
		// is width and the second one is height
		name.setPreferredSize(
				new Dimension(100,50));
		nameInput = new JTextField(15);
		nameInput.setToolTipText("Input your firstname");
		names.add(name);
		names.add(nameInput);
		add(names, BorderLayout.NORTH);
	}
	public void addButtons() {
		buttons = new JPanel();
		submit = new JButton("Submit");
		buttons.add(submit);
		add(buttons, BorderLayout.CENTER);
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
