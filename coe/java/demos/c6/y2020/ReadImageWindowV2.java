package coe.java.demos.c6.y2020;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

class ReadImageV2 extends JPanel {
    BufferedImage img;
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 550, 400);
        g.drawImage(img, 30, 30, null);
        g.setColor(Color.BLACK);
        g.setFont(new Font("San serif", Font.BOLD, 30));
        g.drawString("Khon Kaen University", 50, img.getHeight() + 80);
 
    }
    public ReadImageV2() {
        try {
            img = ImageIO.read(new File("images/kku.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
 
 }

public class ReadImageWindowV2 extends ReadImageWindow {
    public ReadImageWindowV2(String title) {
        super(title);
    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
        this.setSize(550, 400);
    }

    public static void createAndShowGUI() {
        ReadImageWindowV2 window = new ReadImageWindowV2("Read Image Window V2");
        ReadImageV2 readImg = new ReadImageV2();
        window.setContentPane(readImg);
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
