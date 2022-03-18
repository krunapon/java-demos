package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo22 extends JFrame {
    protected JTextArea txtArea;
    protected JScrollPane scrollPane;

    public JTextAreaDemo22(String title) {
        super(title);
    }

    public void setFrameFeatures() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void addComponents(Container contentPane) {
        txtArea = new JTextArea(4, 20);
        txtArea.setText("Russian President Vladimir Putin has ordered " +
                "troops into two rebel-held regions in eastern Ukraine, " +
                "after recognising them as independent states" +
                "Russia said the troops would engage in peacekeeping.");
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        txtArea.append("\nBut the US said calling them peacekeepers was 'nonsense'");
        scrollPane = new JScrollPane(txtArea);
        contentPane.add(scrollPane);
    }

    public static void createAndShowGUI() {
        JTextAreaDemo22 window =  new JTextAreaDemo22("JTextAreaDemo");
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
