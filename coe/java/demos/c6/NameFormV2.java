package coe.java.demos.c6;
import java.awt.event.*;
public class NameFormV2 extends NameForm 
	implements ActionListener {
	public NameFormV2(String title) {
		super(title);
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == exitB) {
			System.exit(0);
		} else if (src == nameT) {
			System.out.println("Your name is "
					+ nameT.getText());
		}
	}
	public void addListeners() {
		exitB.addActionListener(this);
		nameT.addActionListener(this);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameFormV2 nf = new NameFormV2("My Second Form");
		nf.addComponents();
		nf.setFrameFeatures();
		nf.addListeners();
	}

}
