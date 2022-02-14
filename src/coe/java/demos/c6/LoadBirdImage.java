package coe.java.demos.c6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoadBirdImage extends JPanel {
	BufferedImage img;
	Rectangle2D.Double rect;
	public LoadBirdImage() {
		readImage();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(0,0, img.getWidth()+30,
				img.getHeight()+30);
		g.drawImage(img,10,10,null);
	}
	public void readImage() {
		try {
			URL imgLoc =
				this.getClass().getResource("/images/bird.jpg");
			img = ImageIO.read(imgLoc);
			rect = new Rectangle2D.Double(0,0, img.getWidth()+30,
					img.getHeight()+30);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	public Dimension getPreferredSize() {
		if (img == null)
			return new Dimension(100,100);
		else 
			return new Dimension(img.getWidth() + 30,
					img.getHeight() + 30);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Load Bird Image");
		LoadBirdImage birdImg = new LoadBirdImage();
		window.setContentPane(birdImg);
		window.setVisible(true);
		window.pack();
		
	}

}
