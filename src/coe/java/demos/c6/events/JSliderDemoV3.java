package coe.java.demos.c6.events;
import javax.swing.JSlider;
import javax.swing.event.*;
import java.awt.*;
import coe.java.demos.c6.*;
public class JSliderDemoV3 extends JSliderDemoV2 
	implements ChangeListener {
	final static String newline = "\n";
	public JSliderDemoV3(String title) {
		super(title);
	}
	public void addUpdatedArea() {
		super.addUpdatedArea();
		updateArea.setForeground(Color.RED);
		updateArea.setFont(new Font("SansSerif", Font.BOLD, 20));
	}
	public void addListeners() {
		slider1.setName("Slider1");
		slider1.addChangeListener(this);
		slider2.setName("Slider2");
		slider2.addChangeListener(this);
		slider3.setName("Slider3");
		slider3.addChangeListener(this);
	}
	public void stateChanged(ChangeEvent e) {
		// there are 3 sliders so we want to know
		// which source object (slider) that the 
		// user moves the slider knob
	    JSlider source = (JSlider) e.getSource();
	    // wants to get the value only
	    // when the user stops moving the slider knob
	    if (!source.getValueIsAdjusting()) {
	    	int value = source.getValue();
	    	String name = source.getName();
	    	updateArea.append("The value of " + name + " = "
	    			+ value + newline);
	    }
	}
	public static void main(String[] args) {
		JSliderDemoV3 jsd = new JSliderDemoV3("JSliderDemo3");
		jsd.addComponents();
		jsd.addListeners();
		jsd.addUpdatedArea();
		jsd.setFrameFeatures();
	}
	
}


