package coe.java.demos.c6;

import java.awt.*;

import javax.swing.JFrame;
public class LocalFontDemo extends GradientFillsExample {
	public LocalFontDemo() {
		GraphicsEnvironment env =
			GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = env.getAvailableFontFamilyNames();
		System.out.println("Available fonts:");
		for (int i = 0; i < fontNames.length; i++) {
			System.out.println(fontNames[i]);
			if (fontNames[i].equals("Krungthep")) {
				setFont(new Font("Krungthep", Font.BOLD,36));
				break;
			}
		}
	}
	protected void drawBigString(Graphics2D g2d) {
		g2d.setPaint(Color.BLACK);
		g2d.drawString("จาวา 2D", 15,120);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		drawGradientCircle(g2d);
		drawBigString(g2d);
	}
	public static void main(String[] args) {
		JFrame window = new JFrame("Local Font Demo");
		LocalFontDemo content =
			new LocalFontDemo();
		window.setContentPane(content);
		content.setFrameFeatures(window);

		
	}
}
