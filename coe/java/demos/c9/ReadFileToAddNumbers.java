package coe.java.demos.c9;

import java.io.*;

public class ReadFileToAddNumbers {
	public static void main(String[] args) {
		FileInputStream fi = null;
		DataInputStream dis = null;
		FileOutputStream fo = null;
		DataOutputStream dos = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		double d1, d2, result;
		try {
			System.out.println("writing to file");
			fo = new FileOutputStream("input.txt");
			dos = new DataOutputStream(fo);
			dos.writeDouble(2);
			dos.writeDouble(3);
			dos.writeDouble(4);
			dos.writeDouble(6);
			fi = new FileInputStream("input.txt");
			dis = new DataInputStream(fi);
			d1 = dis.readDouble();
			d2 = dis.readDouble();
			result = d1 + d2;
			fw = new FileWriter("output.txt");
			pw = new PrintWriter(fw);
			pw.println(d1 + "  " + d2 + "  " + result);
			d1 = dis.readDouble();
			d2 = dis.readDouble();
			result = d1 + d2;
			pw.println(d1 + "  " + d2 + "  " + result);
			pw.close();
		} catch (EOFException eof) {
			try {
				fi.close();
				dis.close();
				fo.close();
				dos.close();
			} catch (IOException ioex) {
				
			}
		} catch (FileNotFoundException ex1) {
			System.out.println("File not found exception");
		} catch (IOException ex) {
			System.err.println("Error while reading from file ");
			System.err.println(ex);
		}
	}

}
