package coe.java.demos.c6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* 1. load an image file
 *  2. draw the image
 *  3. set content of the frame to be the panel
 *  with the drawn image
 */
public class MyCatsImage extends JPanel {
	BufferedImage img;
	
	public MyCatsImage() {
		try {
			URL myImg =
				this.getClass().getResource("/images/cat.jpg");
			img = ImageIO.read(myImg);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(0,0, getSize().width, getSize().height);
		g.drawImage(img,10,10,null);
	}
	
	public Dimension getPreferredSize() {
		if (img == null)
			return new Dimension(100,100);
		else 
			return new Dimension(img.getWidth()+20,
					img.getHeight()+20);
	}
	public void setFrameFeatures(JFrame frame) {
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(100,75);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Cats Image");
		MyCatsImage content = new MyCatsImage();
		window.setContentPane(content);
		content.setFrameFeatures(window);
	}

}
