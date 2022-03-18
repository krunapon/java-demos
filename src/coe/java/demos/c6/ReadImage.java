package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.net.URL;
public class ReadImage extends JPanel {
		BufferedImage img;
		String filename = "images/kku2022.jpg";
		public void paintComponent(Graphics g) {
			g.drawImage(img,0,0,null);
		}
		public ReadImage() {
		try {
				//URL url = new URL("https://m.kku.ac.th/wp-content/uploads/2019/06/Golden-Jubilee-Convention-Hall.jpg");
				//img = ImageIO.read(url);
				img = ImageIO.read(new File(filename));
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
