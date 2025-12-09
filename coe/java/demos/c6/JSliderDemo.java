package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSliderDemo extends JFrame  {
	protected JSlider slider1, slider2, slider3;
	JPanel content;
	public JSliderDemo(String title) {
		super(title);
	}
	public void addComponents() {
		slider1 = new JSlider(50, 100, 60);
		slider1.setMajorTickSpacing(10);
		slider1.setMinorTickSpacing(5);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider2 = new JSlider(); // use default min, max, value
		slider2.setMajorTickSpacing(25);
		slider2.setMinorTickSpacing(5);
		slider2.setPaintTicks(true);
		slider3 = new JSlider(2000,2100,2006);
		slider3.setLabelTable( slider3.createStandardLabels(50) );
		slider3.setPaintLabels(true);
		content = new JPanel();
		// can have many rows but want only 
		// one column
		content.setLayout(new GridLayout(0,1));
		content.add(slider1);
		content.add(slider2);
		content.add(slider3);
		setContentPane(content);
	}
	public static void main(String[] args) {
		JSliderDemo jsd = new JSliderDemo("JSlider Demo");
		jsd.addComponents();
		jsd.setFrameFeatures();
	}
	public void setFrameFeatures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocation(100,100);
		setVisible(true);
	}
}


