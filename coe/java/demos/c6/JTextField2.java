package coe.java.demos.c6;

import java.awt.*;

import javax.swing.*;
public class JTextField2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel nameL;
	JTextField nameT;
	JButton okB, cancelB;
	// intermediate container
	JPanel contentP, namesP, buttonsP;
	public JTextField2(String title) {
		// call the constructor of superclass 
		// that accepts string
		super(title);
		contentP =new JPanel(new BorderLayout());
		setContentPane(contentP);
	}
	public void addNames() {
		nameL = new JLabel("Firstname:");
		// width = 30, height = 50
		nameL.setPreferredSize(new Dimension(100,50));
		nameT = new JTextField(15);
		nameT.setToolTipText("Please enter your firstname");
		namesP = new JPanel(new FlowLayout());
		namesP.add(nameL);
		namesP.add(nameT);
		contentP.add(namesP, BorderLayout.NORTH);
	}
	public void addButtons() {
		okB = new JButton("OK");
		cancelB = new JButton("Cancel");
		buttonsP = new JPanel(new FlowLayout());
		buttonsP.add(okB);
		buttonsP.add(cancelB);
		contentP.add(buttonsP, BorderLayout.SOUTH);
	}
	public void setFrameFeatures() {
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		JTextField2 window =
			new JTextField2("JTextField2 Form");
		window.addNames();
		window.addButtons();
		window.setFrameFeatures();
	}

}
