package coe.java.demos.c6;
import javax.swing.event.*; // ChangeListener
import javax.swing.*; // JSlider
public class JSliderDemoV3 extends JSliderDemoV2 
    implements ChangeListener {
    public JSliderDemoV3(String title) {
        super(title);
    }

    public void addComponents() {
        super.addComponents();
        slider1.setName("Slider 1");
        slider2.setName("Slider 1");
        slider3.setName("Slider 1");
    }
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        if (!source.getValueIsAdjusting()) {
            int value = source.getValue();
            String name = source.getName();
            updateArea.append("The value of " + name + " = " +
                value + "\n");
        }
    }
    public void addListeners() {
        slider1.addChangeListener(this);
        slider2.addChangeListener(this);
        slider3.addChangeListener(this);
    }
    public static void main(String[] args) {
		JSliderDemoV3 jsd = new JSliderDemoV3("JSliderDemo V3");
		jsd.addComponents();
		jsd.addUpdatedArea();
        jsd.addListeners();
		jsd.setFrameFeatures();
	}
}