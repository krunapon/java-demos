package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.*;
public class PaintV1 extends MyWindow {
    StringDrawerPanel stringPanel;
    public PaintV1(String title) {
        super(title);
    }

    public void drawPanel() {
        stringPanel = new StringDrawerPanel();
        this.setPreferredSize(new Dimension(200, 300));
        this.setContentPane(stringPanel);
    }
    public static void createAndShowGUI() {
        PaintV1 window = new PaintV1("Paint V1");
        window.drawPanel();
        window.setFrameFeatures(); 
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

class StringDrawerPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getWidth();
        int height = this.getHeight();
        int x = width / 2;
        int y = height / 2;
        String msg = "Hello";
        g.drawString(msg, x, y);
    }
}