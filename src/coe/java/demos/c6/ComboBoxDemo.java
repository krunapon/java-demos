package coe.java.demos.c6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// JPanel is a subclass of JComponent
// thus, ComboBoxDemo is also a subclass of JComponent
public class ComboBoxDemo extends JPanel
                          implements ActionListener {
    JLabel picture;
    public ComboBoxDemo() {
        super(new BorderLayout());
        String[] petStrings = { "bird", "cat", "dog", "rabbit", "pig" };
        JComboBox petList = new JComboBox(petStrings);
        petList.setSelectedIndex(2); // select a dog
        petList.addActionListener(this);

        //Set up the picture.
        picture = new JLabel();
        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
        picture.setHorizontalAlignment(JLabel.CENTER);
        updateLabel(petStrings[petList.getSelectedIndex()]);
        // top = 10, left = 0, bottom = 0, right = 0
        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

        //Lay out the demo.
        add(petList, BorderLayout.NORTH);// NORTH
        add(picture, BorderLayout.CENTER); // SOUTH
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String petName = (String)cb.getSelectedItem();
        updateLabel(petName);
    }
    protected void updateLabel(String name) {
    	String imgFile = "images/" + name + ".jpg";
        ImageIcon icon = new ImageIcon(imgFile);
        picture.setIcon(icon);
        if (icon == null) {
            picture.setText("Image not found");
        }
    }
    public static void main(String[] args) {
        //Create and set up the window.
        JFrame frame = new JFrame("ComboBoxDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new ComboBoxDemo();
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }
}
