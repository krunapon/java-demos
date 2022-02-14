package coe.java.demos.c6;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class JListDemoV3 extends JListDemoV2 {
	JPanel controlPane;
	JTextArea output;
	JScrollPane outputPane;
	ListSelectionModel listSelectionModel;
	JComboBox comboBox;
	String newline = "\n";
	String[] modes = { "SINGLE_SELECTION", "SINGLE_INTERVAL_SELECTION",
			"MULTIPLE_INTERVAL_SELECTION" };
	public JListDemoV3(String title) {
		super(title);
	}
	public static void main(String[] args) {
		JListDemoV3 list = new JListDemoV3("JList Demo");
		list.addComponents();
		list.addListeners();
		list.setFrameFeatures();
	}
	public void addListeners() {
		comboBox.addActionListener(new ComboBoxHandler());
		listSelectionModel = jlist.getSelectionModel();
		listSelectionModel.addListSelectionListener(
				new SharedListSelectionHandler());
	}
	
	public void addComponents() {
		// call the addComponents method of its super class
		// by reusing the code of its super class,
		// we don't need to write the code
		// to add JList object
		super.addComponents();
		
		// add selection mode components
		controlPane = new JPanel();
		comboBox = new JComboBox(modes);
		comboBox.setSelectedIndex(2);
		controlPane.add(new JLabel("Selection mode:"));
		controlPane.add(comboBox);
		cp.add(controlPane, BorderLayout.CENTER);

		// add output area components
		// does not specify # rows and # columns here
		// specify through setPreferredSize of JScrollPane
		output = new JTextArea(); 
		output.setForeground(Color.BLUE);  // set text color
		// set font family, style, and size
		output.setFont(new Font("SansSerif", Font.BOLD, 18));
		// don't want the user to edit
		output.setEditable(false);
		outputPane = new JScrollPane(output,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// set preferred size of the scroll pane
		outputPane.setPreferredSize(new Dimension(100,200));
		cp.add(outputPane, BorderLayout.PAGE_END);

	}
	// This class is to listen to the combo box
	// to know which selection mode that the user selects
	class ComboBoxHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String newMode = (String) comboBox.getSelectedItem();
			// single select => can select only one item such as (5)
			if (newMode.equals("SINGLE_SELECTION")) {
				listSelectionModel
						.setSelectionMode(
								ListSelectionModel.SINGLE_SELECTION);
			// single interval selection => can select only one series of items
			// such as (4 5 6)
			} else if (newMode.equals("SINGLE_INTERVAL_SELECTION")) {
				listSelectionModel
						.setSelectionMode(
								ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			// multiple interval selection => can select many series of items
			// such as (1 2)  (4 5 6) (8 9)
			} else {
				listSelectionModel
						.setSelectionMode(
								ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			}
			// display in the text area
			output.append("----------" + "Mode: " + newMode + "----------"
					+ newline);
		}
	}
	// This class is to display the selected items
	// in the text area
	class SharedListSelectionHandler implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			ListSelectionModel lsm = (ListSelectionModel) e.getSource();
			boolean isAdjusting = e.getValueIsAdjusting(); 
	        // Need to make sure that the user finishes
			// selecting
			if (!isAdjusting) {
	        	if (lsm.isSelectionEmpty()) {
	        		output.append(" <none>");
	        	} else {
	        		// Find out which indexes are selected.
	        		int minIndex = lsm.getMinSelectionIndex();
	        		int maxIndex = lsm.getMaxSelectionIndex();
	        		for (int i = minIndex; i <= maxIndex; i++) {
	        			if (lsm.isSelectedIndex(i)) {
	        				output.append(" " + i);
	        			}
	        		}
	        	}
	        	// Print the names of selected items
	        	Object[] selectedNames = jlist.getSelectedValues();
	        	int numSelected = selectedNames.length;
	        	for (int i = 0; i < numSelected; i++) {
	        		output.append(" " + selectedNames[i]);
	        	}
	        	output.append(newline);
				output.setCaretPosition(output.getDocument().getLength());
	        }
		}
	}


}