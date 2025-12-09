package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTextAreaDemoV3 extends JTextAreaDemoV2 
implements ActionListener {
	JLabel updatedLabel;
	JTextField updatedNews;
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
		String text = updatedNews.getText();
		// news is the text area that we 
		// copy the string to
		news.append(newline);
		news.append(text);
		updatedNews.setText("");
	}
	public void addTextField() {
		setLayout(new BorderLayout());
		// set fontsize of JTextArea object
		news.setFont(new Font("Serif", Font.BOLD, 18));
		// put the scroll pane that contains
		// text area in the north section
		add(sp, BorderLayout.NORTH);
		JPanel update = new JPanel(new BorderLayout());
		updatedLabel = new JLabel("Updated News");
		updatedNews = new JTextField(30);
		updatedNews.setFont(new Font("Serif", Font.BOLD, 14));
		update.add(updatedLabel, BorderLayout.NORTH);
		update.add(updatedNews, BorderLayout.CENTER);
		// put the update pane in the cente rsection
		add(update, BorderLayout.CENTER);
		// register updatedNews text field to
		// the listener object
		updatedNews.addActionListener(this);
	}
}

