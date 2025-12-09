package coe.java.demos.c9;
import java.io.*;

public class TextWriter2 {
	public static void main(String[] args) {
		try {
			// open the stream
			FileWriter fw = 
				new FileWriter("output2.txt", true);
			PrintWriter writer =
					new PrintWriter(fw);
			// write data to stream
			writer.println("Now we are learning Java");
			writer.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File output2.txt is not found");
			System.err.println(ex);
		} catch (IOException ioex) {
			System.err.println(ioex);
		}
		
	}
}
