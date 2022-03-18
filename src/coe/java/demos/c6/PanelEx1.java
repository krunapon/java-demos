package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

class MyNamePanel extends JPanel {
    protected String name;
    public MyNamePanel(String name) {
        this.name = name;
    }
    public void paintComponent(Graphics g) {
        int x = this.getWidth() / 2;
        int y = this.getHeight() / 2;
        g.setColor(Color.BLUE);
        g.setFont(new Font("SansSerif", Font.BOLD, 28));
        g.drawString(name, x, y);
    }
}
public class PanelEx1 extends JFrame {
    public PanelEx1(String title) {
        super(title);
    }
    public void setFrameFeatures() {
        this.setVisible(true);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void createAndShowGUI() {
        String id = "642-28-5829";
        PanelEx1 window = new PanelEx1(id);
        window.setContentPane(new MyNamePanel("Manee Jaidee"));
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
