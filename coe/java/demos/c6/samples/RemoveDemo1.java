package coe.java.demos.c6.samples;
/**
 * This sample code is to demostrate how to 
 * change content from having the buttons "OK, "Cancel"
 * to "OK", "New"
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class RemoveDemo1 extends JFrame implements
ActionListener {
	JButton okB, cancelB, newB;
	JPanel content;
	public RemoveDemo1(String title) {
		super(title);
		okB = new JButton("OK");
		cancelB = new JButton("Cancel");
		newB = new JButton("New");
		content = new JPanel(new FlowLayout());
		content.add(okB);
		content.add(cancelB);
		setContentPane(content);
	}
	public void addListeners() {
		okB.addActionListener(this);
		cancelB.addActionListener(this);
		newB.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == okB) {
			okB.setName("Submit");
			content.remove(cancelB);
			content.add(newB);
			// after we add or remove components
			// we need to validate to ensure that
			// a new component has a valid layout
			content.validate();
			pack();  // pack new components
		} 
	}
	public void setFrameFeatures() {
		setVisible(true);
		pack();
		setLocation(200,200);
	}
	public static void main(String[] args) {
		RemoveDemo1 rd = new RemoveDemo1("Remove Button 1");
		rd.addListeners();
		rd.setFrameFeatures();
	}
}
