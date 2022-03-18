package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTextAreaDemoV3 extends JTextAreaDemoV2 
implements ActionListener {
	JLabel updatedLabel;
	JTextField updatedNewsTxtField;
	final static String newline = "\n";
	public JTextAreaDemoV3(String title) {
		super(title);
	}
	public static void main(String[] args) {
		JTextAreaDemoV3 window = new JTextAreaDemoV3("JTextAreaTextField Demo");
		window.addTextField();
		window.setFrameFeatures();
	}
	public void actionPerformed(ActionEvent e) {
		// updatedNews is the text field that 
		// we copy the string from
		String text = updatedNewsTxtField.getText();
		// news is the text area that we 
		// copy the string to
		newsTxtArea.append(newline);
		newsTxtArea.append(text);
		updatedNewsTxtField.setText("");
	}
	public void addTextField() {
		setLayout(new BorderLayout());
		add(newsScrollPane, BorderLayout.NORTH);
		JPanel update = new JPanel(new BorderLayout());
		updatedLabel = new JLabel("Updated News");
		updatedNewsTxtField = new JTextField(30);
		updatedNewsTxtField.setFont(new Font("Serif", Font.BOLD, 14));
		update.add(updatedLabel, BorderLayout.NORTH);
		update.add(updatedNewsTxtField, BorderLayout.CENTER);
		// put the update pane in the cente rsection
		add(update, BorderLayout.CENTER);
		// register updatedNewsTxtField text field to
		// the listener object
		updatedNewsTxtField.addActionListener(this);
	}
}

