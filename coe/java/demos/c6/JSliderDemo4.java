package coe.java.demos.c6;
import javax.swing.*;
public class JSliderDemo4 extends JSliderDemo {
	// Declare the component objects here so that
	// all methods and their subclasses can use them
	JSlider slider4;
	public JSliderDemo4(String title) {
		super(title);
	}
	public void addSlider4() {
		// create the slider with min = 0
		// max = 10 and init value = 7
		slider4 = new JSlider(0,10,7);
		content.add(slider4);
		// set major and minor ticks
		slider4.setMajorTickSpacing(2);
		slider4.setMinorTickSpacing(1);
		slider4.setPaintTicks(true);
		// set labels
		slider4.setLabelTable(slider4.createStandardLabels(2));
		slider4.setPaintLabels(true);
	}
	public static void main(String[] args) {
		JSliderDemo4 jsd = new JSliderDemo4("JSlider Demo4");
		jsd.addComponents();
		jsd.addSlider4();
		jsd.setFrameFeatures();
	}
	
}
