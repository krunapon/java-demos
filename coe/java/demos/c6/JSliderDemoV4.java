package coe.java.demos.c6;
import java.awt.GridLayout;

import javax.swing.*;
public class JSliderDemoV4 extends JSliderDemo {
	// declare the variable here so that 
	// all methods can use it and its subclass 
	// can also use it
	JSlider slider4;  
	public JSliderDemoV4(String title) {
		super(title);
	}

	public void addSlider4() {
		slider4 = new JSlider(0,10,8);
		// Set and make ticks appear
		slider4.setMajorTickSpacing(2);
		slider4.setMinorTickSpacing(1);
		slider4.setPaintTicks(true);
		// Set and make labels appear
		slider4.setLabelTable(
				slider4.createStandardLabels(2));
		slider4.setPaintLabels(true);
		content.add(slider4);
	}
	public static void main(String[] args) {
		JSliderDemoV4 jsd = new JSliderDemoV4("JSliderDemoV4");
		jsd.addComponents();
		jsd.addSlider4();
		jsd.setFrameFeatures();
	}
}
