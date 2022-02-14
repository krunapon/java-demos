package coe.java.demos.c9;

import java.util.*;
import java.io.*;

public class DataStreamWriter {
	public static void main(String[] args) {
		try {
			String filename = "books.txt";
			System.out.println("Start to write file " + filename);
			// open streams to write byte-stream or machine-formatted data
			FileOutputStream fileOutput = new FileOutputStream(filename);
			DataOutputStream dataOutput = new DataOutputStream(fileOutput);
			Map<String, Double> books = new HashMap<String, Double>();
			books.put("NurtureShock: New Thinking About Children", 14.99);
			books.put("7 Habits of Highly Effective People", 5.14);
			// books.keySet() returns all the keys in collection "books"
			// use for loop to get each key
			for (String name : books.keySet()) {
				// use get(key) to get the value of the specified key
				Double price = books.get(name);
				dataOutput.writeUTF(name);
				dataOutput.writeDouble(price);
			}
			dataOutput.close();
			fileOutput.close();
			System.out.println("Finish writing to file " + filename);
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
		}
	}
}
