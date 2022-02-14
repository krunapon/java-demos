package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JSliderDemoV2 extends JSliderDemo {
	JLabel updateLabel;
	protected JTextArea updateArea;
	JScrollPane updatePane;
	final static String newline = "\n";
	JPanel allArea;
	public JSliderDemoV2(String title) {
		super(title);
	}
	public void addUpdatedArea() {
		JPanel update = new JPanel(new BorderLayout());
		updateLabel = new JLabel("Updated Values");
		updateArea = new JTextArea();
		updateArea.setLineWrap(true);
		updateArea.setWrapStyleWord(true);
		updatePane = new JScrollPane(updateArea);
		updatePane.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		updatePane.setPreferredSize(new Dimension(200,100));
		update.add(updateLabel, BorderLayout.NORTH);
		update.add(updatePane, BorderLayout.CENTER);
		allArea = new JPanel();
		allArea.setLayout(new BorderLayout());
		allArea.add(content, BorderLayout.NORTH);
		allArea.add(update, BorderLayout.CENTER);
		setContentPane(allArea);
	}

	public static void main(String[] args) {
		JSliderDemoV2 jsd = new JSliderDemoV2("JSliderDemo2");
		jsd.addComponents();
		jsd.addUpdatedArea();
		jsd.setFrameFeatures();
	}
	
}
