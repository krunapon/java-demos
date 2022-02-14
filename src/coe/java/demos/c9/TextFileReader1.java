package coe.java.demos.c9;
import java.io.*;
public class TextFileReader1 {
	public static void main(String[] args) {
		String filename = "o.txt";
		try {
			FileReader fd = new FileReader(filename);
			BufferedReader br = new BufferedReader(fd);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException ex) {
			System.err.println("Cannot find file " + filename);
		} catch (IOException ioEx) {
			System.err.println("Error while reading from " +
					filename);
		}
	}

}
