package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.net.URL;
public class ReadImage extends JPanel {
		BufferedImage img;
		String filename = "images/taReadAbook.png";
		public void paint(Graphics g) {
			g.drawImage(img,0,0,null);
		}
		public ReadImage() {
			try {
				URL myImg
					= this.getClass().getResource("/images/taReadABook.png");
				img = ImageIO.read(myImg);
			} catch (IOException e) {
				e.printStackTrace(System.err);
			}
		}
		public Dimension getPreferredSize() {
			if (img == null)
				return new Dimension(100,100);
			else 
				return new Dimension(img.getWidth()+20,
						img.getHeight()+60);
		}
		public void setFrameFeatures(JFrame frame) {
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setLocation(100,75);
		}
		public static void main(String[] args) {
			JFrame window = new JFrame("Read Image Demo");
			ReadImage content = new ReadImage();
			window.setContentPane(content);
			content.setFrameFeatures(window);
		}
}
