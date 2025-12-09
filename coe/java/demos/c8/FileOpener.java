package coe.java.demos.c8;

import java.io.*;

class FileHandler {
	public static void openFile(String filename) 
			throws MyOwnException {
		File f = new File(filename);
		if (!f.exists()) {
			throw new MyOwnException(filename + " is not found");
		}
	}
}
public class FileOpener {
	public static void main(String args[]) {
		try {
			FileHandler.openFile(args[0]);
			System.out.println("Open file " + args[0] + " successfully");
		} catch (MyOwnException ex) {
			System.err.println(ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Please provide filename");
		}
	}
}
