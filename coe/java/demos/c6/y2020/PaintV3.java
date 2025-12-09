package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.*;
public class PaintV3 extends MyWindow {
    RectDrawerPanel rectPanel;
    public PaintV3(String title) {
        super(title);
    }

    public void drawPanel() {
        rectPanel = new RectDrawerPanel();
        this.setPreferredSize(new Dimension(200, 400));
        this.setContentPane(rectPanel);
    }
    public static void createAndShowGUI() {
        PaintV3 window = new PaintV3("Paint V3");
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

class RectDrawerPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getWidth();
        int height = this.getHeight();
        g.draw3DRect(50, 50, 100, 200, true);
    }
}