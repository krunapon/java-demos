package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class MyShapes extends JPanel {
    Graphics2D g2d;
    private Ellipse2D.Double circle =
            new Ellipse2D.Double(10,10,100,100);
    private Rectangle2D.Double square =
            new Rectangle2D.Double(55,55,10,10);
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        g2d.fill(square);
        g2d.setColor(Color.RED);
        g2d.draw(circle);
    }
}
public class PanelEx2 extends PanelEx1 {
    public PanelEx2(String title) {
        super(title);
    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
        this.setSize(140, 150);
    }
    public static void createAndShowGUI() {
        String id = "642-28-5829";
        PanelEx1 window = new PanelEx2(id);
        window.setContentPane(new MyShapes());
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
