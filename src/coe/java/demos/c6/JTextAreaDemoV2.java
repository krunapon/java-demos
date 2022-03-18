package coe.java.demos.c6;
import java.awt.*;
import javax.swing.*;
public class JTextAreaDemoV2 extends JFrame {
	protected JTextArea newsTxtArea;
	protected JScrollPane newsScrollPane;
	public JTextAreaDemoV2(String title) {
		super(title);
		setLayout(new FlowLayout());
		// does not specify # of rows and # of columns here
		// set the size through JScrollPane that contains
		// this JTextArea
		newsTxtArea = new JTextArea();
		newsTxtArea.setLineWrap(true);
		newsTxtArea.setWrapStyleWord(true);
		newsTxtArea.setText("Ukrainian President Volodymyr Zelensky has hit back at" +
				" widely discredited Russian disinformation suggesting " +
				" Ukraine is preparing a chemical attack " +
				"Credit: CNN news");

		// create a scroll pane that adds new text area
		newsScrollPane = new JScrollPane(newsTxtArea);
		// makes the scroll bar always appears
		newsScrollPane.setVerticalScrollBarPolicy(
		 		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// set the preferred size of the scroll pane
		newsScrollPane.setPreferredSize(new Dimension(200,100));
		add(newsScrollPane);
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
