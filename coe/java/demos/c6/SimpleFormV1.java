package coe.java.demos.c6;
import javax.swing.*; // For JButton, etc...
import java.awt.*; // For FlowLayout, etc...
public class SimpleFormV1 extends JFrame {
	// Declare attributes outside every method
	// so that its subclass can also use them
	JButton exit;
	JPanel content;
	//	 create a constructor
	public SimpleFormV1(String title) {
		// call the constructor of JFrame
		// and sets the window title to the
		// given title
		super(title);
	}
	public void addButtons() {
		exit = new JButton("Exit");
		// get content pane of the frame
		content = (JPanel) getContentPane();
		content.setLayout(new FlowLayout());
		content.add(exit);
	}
	public void setFrameFeatures() {
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,200);
	}
	public static void main(String[] args) {
		SimpleFormV1 sf = 
			new SimpleFormV1("A Simple Form");
		sf.addButtons();
		sf.setFrameFeatures();
	}
}
