package coe.java.demos.c6;
import java.awt.*;
import javax.swing.*;
public class JTextAreaDemoV2 extends JFrame {
	JTextArea news;
	JScrollPane sp;
	public JTextAreaDemoV2(String title) {
		super(title);
		setLayout(new FlowLayout());
		// does not specify # of rows and # of columns here
		// set the size through JScrollPane that contains
		// this JTextArea
		news = new JTextArea();
		news.setLineWrap(true);
		news.setWrapStyleWord(true);
		news.setText("Bangkok considers moving Asean " +
				"Summit from Phuket to Hua Hin -PM");
		sp = new JScrollPane(news);
		// makes the scroll bar always appears
		sp.setVerticalScrollBarPolicy(
		 		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// set the preferred size of the scroll pane
		sp.setPreferredSize(new Dimension(200,100));
		add(sp);
	}
	public void setFrameFeatures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		JTextAreaDemoV2 window =
			new JTextAreaDemoV2("JTextArea Demo");
		window.setFrameFeatures();
	}
}
