package coe.java.demos.c6.events;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class ColorChooserDemo extends JPanel
                              implements ChangeListener {

    protected JColorChooser tcc;
    protected JLabel banner;
    protected JPanel bannerPanel;
    public ColorChooserDemo() {
        super(new BorderLayout());
        banner = new JLabel("Welcome to the Tutorial Zone!",
                            JLabel.CENTER);
        banner.setForeground(Color.yellow);
        banner.setBackground(Color.blue);
        // tell the componnent be filled with background color
        banner.setOpaque(true); 
        banner.setFont(new Font("SansSerif", Font.BOLD, 24));
        banner.setPreferredSize(new Dimension(100, 65));

        bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.add(banner, BorderLayout.CENTER);
        bannerPanel.setBorder(BorderFactory.createTitledBorder("Special Banner"));
        //Set up color chooser for setting text color
        tcc = new JColorChooser(banner.getForeground());
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder(
                                             "Choose Text Color"));

        add(bannerPanel, BorderLayout.CENTER);
        add(tcc, BorderLayout.PAGE_END);
    }

    public void stateChanged(ChangeEvent e) {
    	// Update foreground color according to the chosen color
        Color newColor = tcc.getColor();
        banner.setForeground(newColor);
    }

    public static void main(String[] args) {
    	// Create and set up the window.
        JFrame frame = new JFrame("ColorChooserDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new ColorChooserDemo();
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
