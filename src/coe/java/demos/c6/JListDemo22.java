package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class JListDemo22 extends JTextAreaDemo22 {
    protected JList daysList;
    protected JLabel daysLabel;
    protected String[] days = {"Sunday", "Monday", "Tuesday",
    "Wednesday", "Thursday", "Friday", "Saturday"};
    protected JButton submitButton;

    public JListDemo22(String title) {
        super(title);
    }
    public void addComponents(Container contentPane) {
        contentPane.setLayout(new BorderLayout());
        daysLabel = new JLabel("Choose days");
        daysList = new JList(days);
        submitButton = new JButton("Submit");
        contentPane.add(daysLabel, BorderLayout.NORTH);
        contentPane.add(daysList, BorderLayout.CENTER);
        contentPane.add(submitButton, BorderLayout.SOUTH);
    }
    public static void createAndShowGUI() {
        JListDemo22 window =  new JListDemo22("JListDemo");
        JPanel panel = new JPanel(); // 2.1, 3.1)
        window.addComponents(panel);
        window.add(panel);
        window.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
