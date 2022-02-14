package coe.java.demos.c6;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ActionListenerDemo extends JFrame
 	implements ActionListener {
	JTextField text = new JTextField(20);
	JButton b = new JButton("Click me");
	private int numClicks = 0;
	public ActionListenerDemo(String title) {
		super(title);
		JPanel content = (JPanel) getContentPane();
		content.setLayout(new FlowLayout());
		content.add(b);
		content.add(text);
		// register or add listener 
		// to the source object
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		ActionListenerDemo myWindow
			= new ActionListenerDemo("My first action");
		myWindow.pack();
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		numClicks++;
		text.setFont(new Font("Serif", Font.BOLD, 16));
		text.setText("Button clicked " + numClicks + " times");
	}
	
}
