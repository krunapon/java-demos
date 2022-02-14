package coe.java.demos.c9;
import java.io.*;
public class TextReader2 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("output2.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str= br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException ex) {
			System.err.println(ex);
		} catch (IOException ioex) {
			System.err.println(ioex);
		}
	}

}
