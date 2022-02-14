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

/*
 * 1. load an image file
 * 2. draw an image on a panel
 * 3. set the content pane of the frame to be 
 * the panel that you draw
 */
public class MyRabbitImage extends JPanel {
	BufferedImage img;
	public MyRabbitImage() {
		try {
			// load an image file
			// the location is relative to the directory
			// of the project
			URL myImg = 
				this.getClass().getResource("/images/rabbit.jpg");
			img = ImageIO.read(myImg);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	
	// draw an image
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0,0,getSize().width, getSize().height);
		g.drawImage(img,10,10,null);
		g.setColor(Color.YELLOW);
		g.drawString("This is a rabbit", 20, 
				img.getHeight() + 30);
	}
	
	public Dimension getPreferredSize() {
		if (img == null) {
			return new Dimension(100,100);
		} else {
			return new Dimension(img.getWidth() + 20,
					img.getHeight() + 60);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("My Rabbit");
		MyRabbitImage content = new MyRabbitImage();
		window.setContentPane(content);
		window.setVisible(true);
		window.pack();
		window.setLocation(100,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
