package coe.java.demos.c6;
import javax.swing.*;
public class NameForm extends JFrame {
	JLabel nameL;
	JTextField nameT;
	JButton exitB;
	JPanel p;
	public NameForm(String title) {
		super(title);
	}
	public void addComponents() {
		p = new JPanel();
		nameL = new JLabel("Name:");
		nameT = new JTextField(15);
		exitB = new JButton("Exit");
		p.add(nameL);
		p.add(nameT);
		p.add(exitB);
		this.setContentPane(p);
	}
	public void setFrameFeatures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
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
