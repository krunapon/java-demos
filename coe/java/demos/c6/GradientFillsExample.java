package coe.java.demos.c6;
import java.awt.geom.*;
import java.awt.*;

import javax.swing.JFrame;
public class GradientFillsExample extends ShapeExamplePanel {
	private GradientPaint gradient 
		= new GradientPaint(0,0, Color.RED, 100,100,
				Color.YELLOW, true);
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;
		drawGradientCircle(g2d);
	}
	protected void drawGradientCircle(Graphics2D g2d) {
		g2d.setPaint(gradient);
		g2d.fill(getCircle());
		g2d.setPaint(Color.BLACK);
		g2d.draw(getCircle());
	}
	public static void main(String[] args) {
		JFrame window = new JFrame("Gradient Demo");
		GradientFillsExample content =
			new GradientFillsExample();
		window.setContentPane(content);
		content.setFrameFeatures(window);

	}
}
