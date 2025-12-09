package coe.java.demos.c9;

import java.io.*;
public class TextFileReader {
	public static void main(String[] args) {
		try {
			String filename = args[0];
			FileReader fr = new FileReader(filename);
			BufferedReader r = new BufferedReader(fr);
			String line;
			/*while ((line = r.readLine()) != null) {
				System.out.println(line);
			}*/
			line = r.readLine();
			// if line is null, then that means there's no
			// more characters to read
			while (line != null) {
				System.out.println(line);
				line = r.readLine();
			}
			r.close();
			fr.close();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Provide filename in the program argument");
		} catch (IOException ex) {
			System.err.println("Error in reading file");
			ex.printStackTrace(System.err);
		}
	}
}
