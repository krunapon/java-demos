package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;

public class NameForm extends JFrame {
	JLabel nameL;
	JTextField nameT;
	JButton exitB;
	JPanel p;
	Font font;
	public NameForm(String title) {
		super(title);
	}
	public void addComponents() {
		p = new JPanel();
		nameL = new JLabel("Name:");
		nameL.setOpaque(true); // make us to see background color
		nameL.setBackground(Color.yellow);
		nameT = new JTextField(30);
		nameT.setToolTipText("Enter your name");
		exitB = new JButton("Exit");
		exitB.setBackground(Color.blue);
		p.add(nameL);
		p.add(nameT);
		p.add(exitB);

		font = new Font("Monospaced", Font.ITALIC, 16);
		nameT.setFont(font);
		nameT.setText("Khon Kaen University");

		nameT.setBackground(Color.PINK);
		nameT.setForeground(Color.BLACK);
		//nameT.setEnabled(false);
		if (nameT.isEnabled()) {
			System.out.println("Text field is enabled");
		} else {
			System.out.println("Text field is not enabled");
		}
		this.setContentPane(p);
	}
	public void setFrameFeatures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		int width = this.getWidth();
		int height = this.getHeight();
		System.out.println("width is " + width + " height is " + height);
		setLocation(100,100);
		setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameForm nf = new NameForm("My First Form");
		nf.addComponents();
		nf.setFrameFeatures();
	}

}
