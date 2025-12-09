package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.*;
public class PaintV2 extends MyWindow {
    LineDrawerPanel linePanel;
    public PaintV2(String title) {
        super(title);
    }

    public void drawPanel() {
        linePanel = new LineDrawerPanel();
        this.setPreferredSize(new Dimension(200, 300));
        this.setContentPane(linePanel);
    }
    public static void createAndShowGUI() {
        PaintV2 window = new PaintV2("Paint V2");
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

class LineDrawerPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getWidth();
        int height = this.getHeight();
        g.drawLine(0, height, width, 0);
    }
}