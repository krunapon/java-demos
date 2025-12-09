package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class UniForm extends SimpleFormV1 {
	JTextField uniName;
	JLabel uniLabel;
	JButton submit;
	JTextArea result;
	JScrollPane resultPane;
	JPanel nameP, resultP, buttonsP;
	public UniForm(String title) {
		super(title);
	}
	public void addComponents() {
		// add JLabel and JTextField
		nameP = new JPanel();
		uniLabel = new JLabel("University Name:");
		uniName = new JTextField(20);
		nameP.add(uniLabel);
		nameP.add(uniName);
		// add JScrollPane with JTextArea
		result = new JTextArea();
		resultPane = new JScrollPane(result);
		resultPane.setPreferredSize
		(new Dimension(400,300));
		resultP = new JPanel();
		resultP.add(resultPane);
		// add JButtons
		buttonsP = new JPanel();
		super.addButtons();
		submit = new JButton("Submit");
		buttonsP.add(submit);
		buttonsP.add(exit);
		// set layout and add panels to the layout
		content.setLayout(new BorderLayout());
		content.add(nameP, BorderLayout.NORTH);
		content.add(resultP, BorderLayout.CENTER);
		content.add(buttonsP, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		UniForm uf = new UniForm("University Form");
		uf.addComponents();
		uf.setFrameFeatures();
	}
}
