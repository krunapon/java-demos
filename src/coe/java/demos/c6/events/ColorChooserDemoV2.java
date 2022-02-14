package coe.java.demos.c6.events;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class ColorChooserDemoV2 extends ColorChooserDemo implements
		ChangeListener, ItemListener {
	JRadioButton fg, bg;
	ButtonGroup colorGroup;
	JPanel colorAreaPanel;
	String selectedArea;

	public ColorChooserDemoV2() {
		super();
		fg = new JRadioButton("Foreground");
		bg = new JRadioButton("Background");
		colorGroup = new ButtonGroup();
		colorAreaPanel = new JPanel();
		colorGroup.add(fg);
		colorGroup.add(bg);
		colorAreaPanel.add(fg);
		colorAreaPanel.add(bg);
		fg.addItemListener(this);
		bg.addItemListener(this);
		add(bannerPanel, BorderLayout.PAGE_START);
		add(tcc, BorderLayout.CENTER);
		add(colorAreaPanel, BorderLayout.PAGE_END);
	}

	public void stateChanged(ChangeEvent e) {
		Color newColor = tcc.getColor();
		if (selectedArea.equals("Foreground")) {
			banner.setForeground(newColor);
		} else if (selectedArea.equals("Background")) {
			banner.setBackground(newColor);
		}
	}

	public void itemStateChanged(ItemEvent e) {
		JRadioButton source = (JRadioButton) e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) {
			selectedArea = source.getText();
		}
	}

	public static void main(String[] args) {
		// Create and set up the window.
		JFrame frame = new JFrame("ColorChooserDemoV2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		JComponent newContentPane = new ColorChooserDemoV2();
		// newContentPane.setOpaque(true); //content panes must be opaque
		frame.setContentPane(newContentPane);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}
