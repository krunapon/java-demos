package coe.java.demos.c9;
import java.io.*; // import PrintWriter and IOException
public class TextFileWriter {
	public static void main(String[] args) {
		String filename = null;
		try {
			filename = args[0];
			// open the stream
			FileWriter fw = new FileWriter(filename);
			PrintWriter p = new PrintWriter(fw);
			// write data to the stream
			p.println("Good bye");
			p.println("Now let's go back to the slide");
			// close the stream
			fw.close();
			p.close();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Provide filename in the program argument");
		} catch (IOException e) {
			System.err.println("Error in writing file" + filename);
		}
	}
}
