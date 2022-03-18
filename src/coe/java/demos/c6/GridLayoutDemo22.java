package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo22 extends JFrame {

    public GridLayoutDemo22(String title) {
        super(title);
    }

    public void setFrameFeatures() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void addComponents(Container contentPane) {
        contentPane.setLayout(new GridLayout(3, 2));
        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("2"));
        contentPane.add(new JButton("This is button three"));
        contentPane.add(new JButton("four"));
    }

    public static void createAndShowGUI() {
        GridLayoutDemo22 window = new GridLayoutDemo22("GridLayout Demo");
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
