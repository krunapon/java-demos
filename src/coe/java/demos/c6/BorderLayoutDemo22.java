package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo22 extends JFrame {

    public BorderLayoutDemo22(String title) {
        super(title);
    }

    public void setFrameFeatures() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void addComponents(Container contentPane) {
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JButton("NORTH"), BorderLayout.NORTH);
        contentPane.add(new JButton("SOUTH"), BorderLayout.NORTH);
        contentPane.add(new JButton("EAST"), BorderLayout.EAST);
        // contentPane.add(new JButton("CENTER"), BorderLayout.CENTER);
        contentPane.add(new JButton("WEST"), BorderLayout.WEST);
    }

    public static void createAndShowGUI() {
        BorderLayoutDemo22 window = new BorderLayoutDemo22("BorderLayout Demo");
        JPanel panel = new JPanel(); // 2.1, 3.1)
        window.addComponents(panel);// 2.2, 3.2)
        // window.add(panel); // 2.3)
        // window.addComponents(window.getContentPane());  //1)
        window.setContentPane(panel); // 3.3
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
