package coe.java.demos.c9;

import java.io.*;

public class TextFileWriter1 {
	public static void main(String[] args) {
		String filename = "o.txt";
		try {
			PrintWriter writer = new PrintWriter("o.txt");
			writer.println("This is KKU");
			writer.close();
		} catch (FileNotFoundException ex) {
			System.err.println("Cannot find file " + filename);
		}
	}

}
