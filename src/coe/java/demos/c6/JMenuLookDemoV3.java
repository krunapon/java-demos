package coe.java.demos.c6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JMenuLookDemoV3 extends JMenuLookDemoV2
	implements ActionListener, ItemListener {
	JTextArea output;
	JScrollPane scrollPane;
	final static String newline = "\n";
	public JMenuLookDemoV3(String title) {
		super(title);
		setContentPane(crtContentPane());
	}
	public Container crtContentPane() {
		JPanel contentPane = new JPanel(new BorderLayout());
		contentPane.setOpaque(true);
		output = new JTextArea();
		output.setEditable(false);
		output.setForeground(Color.BLUE);
		output.setFont(new Font("Serif", Font.BOLD,18));
		scrollPane = new JScrollPane(output);
		scrollPane.setPreferredSize(new Dimension(500,400));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		return contentPane;
	}
	public void setMAKeys(JMenuItem menu, 
			int mKey, int aKey, ActionListener listener) {
		// set mnemonic key
		menu.setMnemonic(mKey);
		menu.setAccelerator(KeyStroke.getKeyStroke(
				aKey, ActionEvent.CTRL_MASK));
		menu.addActionListener(listener);
	}
	public void enableKeyboard() {
	    fileMenu.setMnemonic(KeyEvent.VK_F);
		setMAKeys(newMI, KeyEvent.VK_N, KeyEvent.VK_N, this);
		setMAKeys(openMI, KeyEvent.VK_O, KeyEvent.VK_O, this);
		setMAKeys(saveMI, KeyEvent.VK_S, KeyEvent.VK_S,this);
		setMAKeys(exitMI, KeyEvent.VK_X, KeyEvent.VK_Q,this);	
	}
	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem) e.getSource();
		String command = source.getText();
		String s = "You have clicked menu " + command;
		output.append(s + newline);
		output.setCaretPosition(
				output.getDocument().getLength());
		if (command.equals("Exit")) {
			System.exit(0);
		}
	}
	public void itemStateChanged(ItemEvent e) {
		JMenuItem source = (JMenuItem) e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) {
			String s = "Your file type is " + source.getText();
			output.append(s + newline);
			output.setCaretPosition(
					output.getDocument().getLength());
		}
	}
	public void addItemListeners() {
		java.addItemListener(this);
		cpp.addItemListener(this);
	}
	public static void main(String[] args) {
		JMenuLookDemoV3 window = 
				new JMenuLookDemoV3("JMenuLookActionDemo");
		window.addMenus();
		window.enableKeyboard();
		window.addItemListeners();
		window.setFrameFeatures();
	}
}
