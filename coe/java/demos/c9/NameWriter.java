// package coe.java.demos.c9;

import java.io.*;

public class NameWriter {
	public static void main(String[] args) {
		String filename = "manee.txt";
		try {
            System.out.println("Writing my names to " + filename);
        //	PrintWriter writer = new PrintWriter(filename);
            FileWriter fwriter = new FileWriter(filename, true);
            PrintWriter writer = new PrintWriter(fwriter);
            writer.println("Manee Jaidee");
            writer.println("มานี ใจดี");
         //   writer.println("Ning");
			writer.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
