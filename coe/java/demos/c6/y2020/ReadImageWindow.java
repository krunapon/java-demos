package coe.java.demos.c6.y2020;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

public class ReadImageWindow extends MyWindow {
    public ReadImageWindow(String title) {
        super(title);
    }

    public void setFrameFeatures() {
        super.setFrameFeatures();
        this.setSize(500, 300);
    }
    public static void createAndShowGUI() {
        ReadImageWindow window = new ReadImageWindow("Read Image Window");
        ReadImage readImg = new ReadImage();
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
class ReadImage extends JPanel {
   BufferedImage img;
   public void paint(Graphics g) {
       g.drawImage(img, 0, 0, null);
   }
   public ReadImage() {
       try {
           img = ImageIO.read(new File("images/kku.jpg"));
       } catch (IOException ex) {
           ex.printStackTrace(System.err);
       }
   }

}