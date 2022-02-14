package coe.java.demos.c6;

import java.awt.event.*;
import java.io.File;
import javax.swing.JFileChooser;


// Add menu Edit which has Copy and Paste
public class JMenuLookDemoV4 extends 
	JMenuLookDemoV3 implements ActionListener, ItemListener {
	 JFileChooser fc;
	public JMenuLookDemoV4(String title) {
		super(title);
		fc = new JFileChooser();
	    
	}
	public void actionPerformed(ActionEvent e) {
		// Want to know which menu item that the user selects
		if (e.getSource() == openMI) {
			output.append("You click menu open" + newline);
			int returnVal = fc.showOpenDialog(JMenuLookDemoV4.this);
			// when the user chooses "open" or "ok" button
			// of the open dialog
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fc.getSelectedFile();
				// get file name
				String filename = selectedFile.getName();
				output.append("You want to open file " +
						filename + newline);
			}
		} else if (e.getSource() == saveMI) {
			output.append("You click menu save" + newline);
			int returnVal = fc.showSaveDialog(JMenuLookDemoV4.this);
			// when the user chooses "open" or "ok" button
			// of the open dialog
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fc.getSelectedFile();
				// get file name
				String filename = selectedFile.getName();
				output.append("You want to save file " +
						filename + newline);
			}
		} else if (e.getSource() == exitMI) {
			System.exit(0);
		} else if (e.getSource() == newMI) {
			output.setText("");
		}
	}
	public static void main(String[] args) {
		JMenuLookDemoV4 window = 
				new JMenuLookDemoV4("JMenuLookDemoV4");
		window.addMenus();
		window.enableKeyboard();
		window.addItemListeners();
		window.setFrameFeatures();
	}
}
