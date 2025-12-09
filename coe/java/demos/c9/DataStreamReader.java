package coe.java.demos.c9;

import java.io.*;
import java.util.*;

public class DataStreamReader {
	public static void main(String[] args) {
		DataInputStream dataInput = null;
		FileInputStream fileInput = null;
		try {
			String filename = "input.txt";
			fileInput = new FileInputStream(filename);
			dataInput = new DataInputStream(fileInput);
			try {
				while (true) {
					double d1 = dataInput.readDouble();
					double d2 = dataInput.readDouble();
					System.out.println(d1 + " " + d2);
 				}
			} catch (EOFException ex) {
				dataInput.close();
				fileInput.close();
			}
		} catch (IOException ex2) {
			ex2.printStackTrace(System.err);			
		}
	}
}
