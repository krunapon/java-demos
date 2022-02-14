package coe.java.demos.c6;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ParentChildDemo extends JFrame {
	JButton submit;
	JCheckBox year1, year2;
	JPanel content;
	JDialog dialog;
	MyListener listener;
	class MyListener implements ActionListener,
	ItemListener {
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			String srcClass = src.getClass().getName();
			if (srcClass.contains("JButton")) {
				if (src.equals(submit)) {
					// x = 100, y = 100
					// width = 300 height = 100
					dialog.setBounds(400,100,100,200);
					dialog.setVisible(true);
					
					if (year1.isSelected()) {
						System.out.println("year1 is selected");
					}
					if (year2.isSelected()) {
						System.out.println("year2 is selected");
					}
				}
			} 
		}
		public void itemStateChanged(ItemEvent e) {
			ItemSelectable src = e.getItemSelectable();
			if (src instanceof JCheckBox) {
				JCheckBox cb = (JCheckBox) src;
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(cb.getText() + " is selected");
				} else {
					System.out.println(cb.getText() + " is deselected");
				}
			}
		}
	}
	public ParentChildDemo(String title) {
		super(title);
		content = new JPanel(new FlowLayout());
		submit = new JButton("Submit");
		year1 = new JCheckBox("year1", true);
		year2 = new JCheckBox("year2");
		content.add(submit);
		content.add(year1);
		content.add(year2);
		setContentPane(content);
		dialog = new JDialog(this,"Result",
			Dialog.ModalityType.MODELESS);
		listener = new MyListener();
	}
	public void setFeatures() {
		pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100,100);
		setVisible(true);
	}
	public void addListeners() {
		submit.addActionListener(listener);
		year1.addItemListener(listener);
		year2.addItemListener(listener);
	}
	public static void main(String[] args) {
		ParentChildDemo pc = new ParentChildDemo("Demo");
		pc.setFeatures();
		pc.addListeners();
	}
}
