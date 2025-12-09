package coe.java.demos.c6.y2020;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PaintV5 extends MyWindow {
    ShapeDrawerPanelV2 shapePanel;
    public PaintV5(String title) {
        super(title);
    }

    public void drawPanel() {
        shapePanel = new ShapeDrawerPanelV2();
        this.setPreferredSize(new Dimension(250, 250));
        this.setContentPane(shapePanel);
    }
    public static void createAndShowGUI() {
        PaintV5 window = new PaintV5("Paint V5");
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

class ShapeDrawerPanelV2 extends ShapeDrawerPanel {
    private GradientPaint gradient = 
    new GradientPaint(0, 0, Color.RED, 100, 100,
            Color.YELLOW, true);
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(gradient);
        g2d.fill(circle);
    }

}