package coe.java.demos.c6;
import java.awt.GraphicsEnvironment;
public class ListFonts {
	public static void main(String[] args) {
		GraphicsEnvironment env =
			GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = env.getAvailableFontFamilyNames();
		System.out.println("Available fonts:");
		for (int i = 0; i < fontNames.length; i++)
			System.out.println(" " + fontNames[i]);
	}
}
